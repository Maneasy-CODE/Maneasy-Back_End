package api.maneasy.controllers;

import api.maneasy.repositories.ServicoRepository;
import org.hibernate.annotations.DialectOverride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/servico", produces = {"application/jason"})
public class ServicoController {

}
