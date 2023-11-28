package api.maneasy.controllers;

import api.maneasy.models.ProfissionalHardSkillModel;
import api.maneasy.repositories.ProfissionalHardSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/", produces = {"application/json"})
public class ProfissionalHardSkillController {

    @Autowired
    ProfissionalHardSkillRepository profissionaisHardSkillRepository;

    public ResponseEntity<List<ProfissionalHardSkillModel>>listarProfissionaisHardSkill(){
        return ResponseEntity.status(HttpStatus.OK).body(profissionaisHardSkillRepository.findAll());
    }




}
