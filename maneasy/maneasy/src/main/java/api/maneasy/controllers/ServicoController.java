package api.maneasy.controllers;

import api.maneasy.dtos.ServicoDto;
import api.maneasy.models.ServicoModel;
import api.maneasy.repositories.ServicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/servicos", produces = {"application/json"})
public class ServicoController {
    @Autowired
    ServicoRepository servicoRepository;

    @GetMapping
    public ResponseEntity<List<ServicoModel>> listarServicos() {
        return ResponseEntity.status(HttpStatus.OK).body(servicoRepository.findAll());
    }

    @GetMapping("/por-titulo")
    public ResponseEntity<List<ServicoModel>> listarServicosPorTitulo(@RequestParam String titulo) {
        List<ServicoModel> servicosEncontrados = servicoRepository.findByNome_servicosContainingIgnoreCase(titulo);
        if (servicosEncontrados.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
        }
        return ResponseEntity.ok(servicosEncontrados);
    }

    @GetMapping("/{idServicos}")
    public ResponseEntity<Object> buscarServico(@PathVariable(value = "idServicos") UUID id) {
        Optional<ServicoModel> servicoBuscado = servicoRepository.findById(id);
        if (servicoBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body("Serviço não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(servicoBuscado.get());
    }

    @PostMapping
    public ResponseEntity<Object> criarServico(@RequestBody @Valid ServicoDto servicoDto) {
        ServicoModel servicoModel = new ServicoModel();

        BeanUtils.copyProperties(servicoDto, servicoModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(servicoRepository.save(servicoModel));
    }

    @PutMapping("/{idServicos}")
    public ResponseEntity<Object> editarServico(@PathVariable(value = "idServicos") UUID id, @RequestBody @Valid ServicoDto servicoDto) {
        Optional<ServicoModel> servicoBuscado = servicoRepository.findById(id);
        if (!servicoBuscado.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Serviço não encontrado");
        }

        ServicoModel servicoAtualizado = servicoBuscado.get();
        BeanUtils.copyProperties(servicoDto, servicoAtualizado);

        return ResponseEntity.status(HttpStatus.OK).body(servicoRepository.save(servicoAtualizado));
    }

    @DeleteMapping("/{idServicos}")
    public ResponseEntity<Object> deletarServico(@PathVariable(value = "idServicos") UUID id) {
        Optional<ServicoModel> servicoBuscado = servicoRepository.findById(id);

        if (servicoBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Serviço não encontrado");
        }
        servicoRepository.delete(servicoBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Servico deletado com sucesso!");
    }
}







