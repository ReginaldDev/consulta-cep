package com.reginalddev.consultacep.service;

import com.reginalddev.consultacep.model.Endereco;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepService {

    public Endereco consultarCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        RestTemplate restTemplate = new RestTemplate();
        Endereco endereco = restTemplate.getForObject(url, Endereco.class);

        return endereco;
    }
}
