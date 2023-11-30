package api.maneasy.controllers;

import api.maneasy.dtos.ProfissionalDto;
import api.maneasy.dtos.ProfissionalHardSkillDto;
import api.maneasy.models.ProfissionalHardSkillModel;
import api.maneasy.models.ProfissionalModel;
import api.maneasy.repositories.HardSkillRepository;
import api.maneasy.repositories.ProfissionalHardSkillRepository;
import api.maneasy.repositories.ProfissionalRepository;
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
@RequestMapping(value = "/profissionalHardSkill", produces = {"application/json"})
public class ProfissionalHardSkillController {

    @Autowired
    ProfissionalHardSkillRepository profissionaisHardSkillRepository;

    @Autowired
    HardSkillRepository hardSkillRepository;

    @Autowired
    ProfissionalRepository profissionalRepository;

    @GetMapping
    public ResponseEntity<List<ProfissionalHardSkillModel>>listarProfissionaisHardSkill(){
        return ResponseEntity.status(HttpStatus.OK).body(profissionaisHardSkillRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> criarProfissionalHardSkill(@RequestBody @Valid ProfissionalHardSkillDto profissionalHardSkillDto){
        ProfissionalHardSkillModel novoProfissionalHardSkill = new ProfissionalHardSkillModel();
        BeanUtils.copyProperties(profissionalHardSkillDto, novoProfissionalHardSkill);

        var hardskill = hardSkillRepository.findById(profissionalHardSkillDto.id_hard_skill());
        if (hardskill.isPresent()){
            novoProfissionalHardSkill.setId_hard_skill(hardskill.get());
        } else {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("HardSkill nao encontrado");
        }

        var profissional = profissionalRepository.findById(profissionalHardSkillDto.id_profissional());
        if (profissional.isPresent()){
            novoProfissionalHardSkill.setId_profissional(profissional.get());
        } else {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Profissional nao encontrado");        }

        return ResponseEntity.status(HttpStatus.CREATED).body(profissionaisHardSkillRepository.save(novoProfissionalHardSkill));
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
