package com.denarde.agenda.api.controller;

import com.denarde.agenda.domain.Entity.Pessoa;
import com.denarde.agenda.domain.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @Autowired
    PessoaRepository pessoaRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Pessoa save(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
}
