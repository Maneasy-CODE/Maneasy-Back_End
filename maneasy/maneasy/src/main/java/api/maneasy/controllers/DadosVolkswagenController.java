package api.maneasy.controllers;

import api.maneasy.models.DadosVolkswagenModel;
import api.maneasy.models.ProfissionalModel;
import api.maneasy.repositories.DadosVolkswagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/dadosVolkswagen", produces = {"application/json"})
public class DadosVolkswagenController {

    @Autowired
    DadosVolkswagenRepository dadosVolkswagenRepository;

    @GetMapping
    public ResponseEntity<List<DadosVolkswagenModel>> listarDadosVolkswagen(){
        return ResponseEntity.status(HttpStatus.OK).body(dadosVolkswagenRepository.findAll());
    }

    @GetMapping("/{id_dados_volkswagen}")
    public ResponseEntity<Object> buscarDadosVolkswagen(@PathVariable(value = "id_dados_volkswagen") UUID id){
        Optional<DadosVolkswagenModel> dadosVolkswagenBuscado = dadosVolkswagenRepository.findById(id);

        if (dadosVolkswagenBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Profissional não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(dadosVolkswagenBuscado.get());
    }
}
