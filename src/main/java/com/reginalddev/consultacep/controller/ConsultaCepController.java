package com.reginalddev.consultacep.controller;

import com.reginalddev.consultacep.model.Endereco;
import com.reginalddev.consultacep.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cep")
public class ConsultaCepController {

    @Autowired
    private ViaCepService viaCepService;

    @GetMapping("/{cep}")
    public Endereco consultar(@PathVariable String cep) {
        return viaCepService.consultarCep(cep);
    }
}