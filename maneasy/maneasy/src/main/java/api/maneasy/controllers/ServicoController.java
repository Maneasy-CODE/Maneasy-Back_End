package api.maneasy.controllers;

import api.maneasy.dtos.ServicoDto;
import api.maneasy.models.ServicoModel;
import api.maneasy.repositories.ServicoRepository;
//import org.hibernate.annotations.DialectOverride;
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
    public ResponseEntity<Object> criarServico(@RequestBody @Valid ServicoDto servicosDto) {

        ServicoModel novoServico = new ServicoModel();
        BeanUtils.copyProperties(servicosDto, novoServico);

        return ResponseEntity.status(HttpStatus.CREATED).body(servicoRepository.save(novoServico));
    }

    @GetMapping("/{isServico}")
    public ResponseEntity<Object> buscarServico(@PathVariable(value = "idServico") UUID id) {
        Optional<ServicoModel> servicoBuscado = servicoRepository.findById(id);

        if (servicoBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body("Serviço não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(servicoBuscado.get());
    }

    @DeleteMapping("/{idServico}")
    public ResponseEntity<Object> deletarServico(@PathVariable(value = "idServico") UUID id) {
        Optional<ServicoModel> servicoBuscado = servicoRepository.findById(id);

        if (servicoBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Serviço não encontrado");
        }
        servicoRepository.delete(servicoBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Servico deletado com sucesso!");
    }
}







