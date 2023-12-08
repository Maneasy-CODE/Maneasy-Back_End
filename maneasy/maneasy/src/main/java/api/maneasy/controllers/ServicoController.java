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
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/servicos", produces = {"application/jason"})
public class ServicoController {
    @Autowired
    ServicoRepository servicoRepository;

    @GetMapping
    public ResponseEntity<List<ServicoModel>> listarServicos() {
        return ResponseEntity.status(HttpStatus.OK).body(servicoRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> criarServico(@RequestBody @Valid ServicoDto servicoDto) {

        ServicoModel novoServico = new ServicoModel();
        BeanUtils.copyProperties(servicoDto, novoServico);

        return ResponseEntity.status(HttpStatus.CREATED).body(servicoRepository.save(novoServico));
    }
    @GetMapping("/{idServicos}")
    public ResponseEntity<Object> buscarServico(@PathVariable(value = "idServicos") UUID id) {
        Optional<ServicoModel> servicoBuscado = servicoRepository.findById(id);
        if (servicoBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body("Serviço não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(servicoBuscado.get());
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







