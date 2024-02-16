package api.maneasy.controllers;

import api.maneasy.dtos.ProfissionalSquadsDto;
import api.maneasy.models.ProfissionalSquadsModel;
import api.maneasy.repositories.ProfissionalRepository;
import api.maneasy.repositories.ProfissionalSquadsRepository;
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

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/profissionalSquads", produces = {"application/json"})
public class ProfissionalSquadsController {
    @Autowired
    ProfissionalSquadsRepository profissionalSquadRepository;

    @Autowired
    SquadRepository squadRepository;

    @Autowired
    ProfissionalRepository profissionalRepository;

    @GetMapping
    public ResponseEntity<List<ProfissionalSquadsModel>> listarProfissionaisSquad(){
        return ResponseEntity.status(HttpStatus.OK).body(profissionalSquadRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> criarProfissionalHardSkill(@RequestBody @Valid ProfissionalSquadsDto profissionalSquadsDto){
        ProfissionalSquadsModel novoProfissionalSquad = new ProfissionalSquadsModel();
        BeanUtils.copyProperties(profissionalSquadsDto, novoProfissionalSquad);

        var squad = squadRepository.findById(profissionalSquadsDto.id_squads());
        if (squad.isPresent()){
            novoProfissionalSquad.setId_squads(squad.get());
        } else {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Squad nao encontrado");
        }

        var profissional = profissionalRepository.findById(profissionalSquadsDto.id_profissional());

        if (profissional.isPresent()){
            novoProfissionalSquad.setProfissional(profissional.get());
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Profissional nao encontrado");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(profissionalSquadRepository.save(novoProfissionalSquad));
    }

    @DeleteMapping("/{idProfssionalSquad}")
    public ResponseEntity<Object> deletarProfissionalSquad(@PathVariable(value = "idProfssionalSquad") UUID id){
        Optional<ProfissionalSquadsModel> profissionalSquadBuscado = profissionalSquadRepository.findById(id);
        if (profissionalSquadBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id profissional squad não encontrado");
        }
        profissionalSquadRepository.delete(profissionalSquadBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Id profissional squad deletado com sucesso!");
    }
}
