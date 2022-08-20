package com.denarde.agenda.api.controller;

import com.denarde.agenda.domain.Entity.Contato;
import com.denarde.agenda.domain.Repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contato")
public class ContatoController {

    @Autowired
    ContatoRepository contatoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Contato save(@RequestBody Contato contato){
        return contatoRepository.save(contato);
    }
}
