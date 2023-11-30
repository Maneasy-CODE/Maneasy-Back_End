package api.maneasy.controllers;

import api.maneasy.models.SquadModel;
import api.maneasy.repositories.SquadRepository;
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
@RequestMapping(value = "/squads", produces = {"application/json"})
public class SquadController {

    @Autowired
    SquadRepository squadRepository;

    @GetMapping
    public ResponseEntity<List<SquadModel>> listarSquads() {
        return ResponseEntity.status(HttpStatus.OK).body(squadRepository.findAll());
    }
    @GetMapping("/{idSquad}")
    public ResponseEntity<Object> buscarSquad(@PathVariable(value = "idSquad") UUID id){
        Optional<SquadModel> squadBuscada = squadRepository.findById(id);

        if (squadBuscada.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(squadBuscada.get());
    }

}
