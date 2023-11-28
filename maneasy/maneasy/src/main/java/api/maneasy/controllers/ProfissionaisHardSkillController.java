package api.maneasy.controllers;

import api.maneasy.models.ProfissionaisHardSkillModel;
import api.maneasy.repositories.ProfissionaisHardSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/", produces = {"application/json"})
public class ProfissionaisHardSkillController {

    @Autowired
    ProfissionaisHardSkillRepository profissionaisHardSkillRepository;

    public ResponseEntity<List<ProfissionaisHardSkillModel>>listarProfissionaisHardSkill(){
        return ResponseEntity.status(HttpStatus.OK).body(profissionaisHardSkillRepository.findAll());
    }

    @


}
