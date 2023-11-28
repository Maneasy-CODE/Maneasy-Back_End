package api.maneasy.controllers;

import api.maneasy.models.HardSkillModel;
import api.maneasy.repositories.HardSkillRepository;
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
@RequestMapping(value = "/hardSkills", produces = {"application/json"})
public class HardSkillController {

    @Autowired
    HardSkillRepository hardSkillRepository;

    @GetMapping
    public ResponseEntity<List<HardSkillModel>> listarHardSkill() {
        return ResponseEntity.status(HttpStatus.OK).body(hardSkillRepository.findAll());
    }
    @GetMapping("/{idHardSkill}")
    public ResponseEntity<Object> buscarHardSkill(@PathVariable(value = "idHardSkill") UUID id){
        Optional<HardSkillModel> hardSkillBuscada = hardSkillRepository.findById(id);

        if (hardSkillBuscada.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(hardSkillBuscada.get());
    }

}
