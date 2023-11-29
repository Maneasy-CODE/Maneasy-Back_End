package api.maneasy.controllers;

import api.maneasy.models.ProfissionalHardSkillModel;
import api.maneasy.models.ProfissionalModel;
import api.maneasy.repositories.ProfissionalHardSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/profissionalHardSkill", produces = {"application/json"})
public class ProfissionalHardSkillController {

    @Autowired
    ProfissionalHardSkillRepository profissionaisHardSkillRepository;
    @GetMapping
    public ResponseEntity<List<ProfissionalHardSkillModel>>listarProfissionaisHardSkill(){
        return ResponseEntity.status(HttpStatus.OK).body(profissionaisHardSkillRepository.findAll());
    }

    @GetMapping("/{idProfssionalHardSkill}")
    public ResponseEntity<Object> buscarProfissionalHardSkill(@PathVariable(value = "idProfssionalHardSkill") UUID id){
        Optional<ProfissionalHardSkillModel> profissionalHardSkillBuscado = profissionaisHardSkillRepository.findById(id);

        if (profissionalHardSkillBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Profissional / HardSkill não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(profissionalHardSkillBuscado.get());
    }

    @DeleteMapping("/{idProfssionalHardSkill}")
    public ResponseEntity<Object> deletarProfissionalHardSkill(@PathVariable(value = "idProfssionalHardSkill") UUID id){
        Optional<ProfissionalHardSkillModel> profissionalHardSkillBuscado = profissionaisHardSkillRepository.findById(id);

        if (profissionalHardSkillBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Profissional / HardSkill não encontrado");
        }
        profissionaisHardSkillRepository.delete(profissionalHardSkillBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Profissional / HardSkill deletado com sucesso!");
    }

}
