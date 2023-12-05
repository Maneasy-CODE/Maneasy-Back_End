package api.maneasy.controllers;

import api.maneasy.dtos.ChamadoDto;
import api.maneasy.models.ChamadoModel;
import api.maneasy.repositories.ChamadoRepository;
import api.maneasy.services.FileUploadService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(
        value = {"/chamado"},
        produces = {"application/json"}
)
public class ChamadoController {
    @Autowired
    ChamadoRepository chamadoRepository;
    @Autowired
    FileUploadService fileUploadService;

    public ChamadoController() {
    }

    @GetMapping
    public ResponseEntity<List<ChamadoModel>> listarChamados() {
        return ResponseEntity.status(HttpStatus.OK).body(this.chamadoRepository.findAll());
    }

    @GetMapping({"/{id_chamado}"})
    public ResponseEntity<Object> buscarChamadoId(@PathVariable("id_chamado") UUID id) {
        Optional<ChamadoModel> chamadoBuscado = this.chamadoRepository.findById(id);
        return chamadoBuscado.isEmpty() ? ResponseEntity.status(HttpStatus.NOT_FOUND).body("Chamado no encontrado") : ResponseEntity.status(HttpStatus.OK).body(chamadoBuscado.get());
    }

    public ResponseEntity<Object> cadastrarChamado(@RequestBody @Valid ChamadoDto dadosRecibidos) {
        ChamadoModel chamadoModel = new ChamadoModel();
        BeanUtils.copyProperties(dadosRecibidos, chamadoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(this.chamadoRepository.save(chamadoModel));
    }

    @PutMapping(
            value = {"/{id_chamado}"},
            consumes = {"multipart/form-data"}
    )
    public ResponseEntity<Object> editarChamado(@PathVariable("id_chamado") UUID id, @ModelAttribute @Valid ChamadoDto chamadoDto) {
        Optional<ChamadoModel> chamadoBusacado = this.chamadoRepository.findById(id);
        if (chamadoBusacado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Chamado não encontrado");
        } else {
            ChamadoModel chamadoModel = (ChamadoModel)chamadoBusacado.get();
            BeanUtils.copyProperties(chamadoDto, chamadoModel);

            String urlImg;
            try {
                urlImg = this.fileUploadService.fazerUpload(chamadoDto.anexo());
            } catch (IOException var7) {
                throw new RuntimeException(var7);
            }

            chamadoModel.setUrl_img(urlImg);
            return ResponseEntity.status(HttpStatus.OK).body(this.chamadoRepository.save(chamadoModel));
        }
    }

    @DeleteMapping({"/{id_chamado}"})
    public ResponseEntity<Object> deletarChamado(@PathVariable("id_chamado") UUID id) {
        Optional<ChamadoModel> chamadoBuscado = this.chamadoRepository.findById(id);
        if (chamadoBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Chamado não encontrado");
        } else {
            this.chamadoRepository.delete((ChamadoModel)chamadoBuscado.get());
            return ResponseEntity.status(HttpStatus.OK).body("Chamado deletado com sucesso!");
        }
    }
}
