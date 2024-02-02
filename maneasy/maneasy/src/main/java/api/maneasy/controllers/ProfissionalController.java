package api.maneasy.controllers;

import api.maneasy.dtos.ProfissionalDto;
import api.maneasy.dtos.UsuarioDto;
import api.maneasy.models.ProfissionalModel;
import api.maneasy.models.UsuarioModel;
import api.maneasy.repositories.ProfissionalRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/profissional", produces = {"application/json"})
public class ProfissionalController {
    @Autowired
    ProfissionalRepository profissionalRepository;
    @GetMapping
    public ResponseEntity<List<ProfissionalModel>> listarProfissional(){
        return ResponseEntity.status(HttpStatus.OK).body(profissionalRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> criarProfissional(@RequestBody @Valid ProfissionalDto profissionalDto){

        ProfissionalModel novoProfissional = new ProfissionalModel();
        BeanUtils.copyProperties(profissionalDto, novoProfissional);

        return ResponseEntity.status(HttpStatus.CREATED).body(profissionalRepository.save(novoProfissional));
    }

    @GetMapping("/{idProfissional}")
    public ResponseEntity<Object> buscarProfissional(@PathVariable(value = "idProfissional") UUID id){
        Optional<ProfissionalModel> profissionalBuscado = profissionalRepository.findById(id);

        if (profissionalBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Profissional não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(profissionalBuscado.get());
    }

    @PutMapping("/{idProfissional}")
    public ResponseEntity<Object> editarProfissional(@PathVariable(value = "idProfissional") UUID id, @RequestBody @Valid ProfissionalDto profissionalDto) {
        Optional<ProfissionalModel> profissionalBuscado = profissionalRepository.findById(id);

        if (profissionalBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Profissional não encontrado");
        }

        ProfissionalModel profissionalModel = profissionalBuscado.get();
        BeanUtils.copyProperties(profissionalDto, profissionalModel);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(profissionalRepository.save(profissionalModel));
    }

    @DeleteMapping("/{idProfissional}")
    public ResponseEntity<Object> deletarProfissional(@PathVariable(value = "idProfissional") UUID id){
        Optional<ProfissionalModel> profissionalBuscado = profissionalRepository.findById(id);

        if (profissionalBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Profissional não encontrado");
        }
        profissionalRepository.delete(profissionalBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Profissional deletado com sucesso!");
    }
}
