package api.maneasy.controllers;

import api.maneasy.models.ServicoModel;
import api.maneasy.repositories.ServicoRepository;
//import org.hibernate.annotations.DialectOverride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/servicos", produces = {"application/jason"})
public class ServicoController {

    @Autowired
    ServicoRepository servicoRepository;

    @GetMapping
    public ResponseEntity<List<ServicoModel>> listarServicos(){
        return ResponseEntity.status(HttpStatus.OK).body(servicoRepository.findAll());
    }

}
