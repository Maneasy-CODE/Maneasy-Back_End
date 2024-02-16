package api.maneasy.controllers;

import api.maneasy.dtos.ProfissionalDto;
import api.maneasy.dtos.ServicoDto;
import api.maneasy.dtos.SquadDto;
import api.maneasy.models.ProfissionalModel;
import api.maneasy.models.ServicoModel;
import api.maneasy.models.SquadModel;
import api.maneasy.repositories.SquadRepository;
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
@CrossOrigin(origins = "*")
@RequestMapping(value = "/squads", produces = {"application/json"})
public class SquadController {

    @Autowired
    SquadRepository squadRepository;

    @GetMapping
    public ResponseEntity<List<SquadModel>> listarSquads() {
        return ResponseEntity.status(HttpStatus.OK).body(squadRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> criarSquad(@RequestBody @Valid SquadDto squadDto){

        SquadModel novoSquad = new SquadModel();
        BeanUtils.copyProperties(squadDto, novoSquad);

        return ResponseEntity.status(HttpStatus.CREATED).body(squadRepository.save(novoSquad));
    }

    @GetMapping("/{idSquad}")
    public ResponseEntity<Object> buscarSquad(@PathVariable(value = "idSquad") UUID id){
        Optional<SquadModel> squadBuscada = squadRepository.findById(id);

        if (squadBuscada.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Squad não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(squadBuscada.get());
    }

    @PutMapping("/{idSquad}")
    public ResponseEntity<Object> editarSquad(@PathVariable(value = "idSquad") UUID id, @RequestBody @Valid SquadDto squadDto) {
        Optional<SquadModel> squadBuscado = squadRepository.findById(id);

        if (squadBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Squad não encontrado");
        }

        SquadModel squadModel = squadBuscado.get();
        BeanUtils.copyProperties(squadDto, squadModel);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(squadRepository.save(squadModel));
    }

    @DeleteMapping("/{idSquad}")
    public ResponseEntity<Object> deletarSquad(@PathVariable(value = "idSquad") UUID id) {
        Optional<SquadModel> squadBuscado = squadRepository.findById(id);

        if (squadBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Squad não encontrado");
        }
        squadRepository.delete(squadBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Squad deletado com sucesso!");
    }

}