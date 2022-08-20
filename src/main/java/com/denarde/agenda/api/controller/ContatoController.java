package com.denarde.agenda.api.controller;

import com.denarde.agenda.domain.Entity.Contato;
import com.denarde.agenda.domain.Repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contato")
public class ContatoController {

    @Autowired
    ContatoRepository contatoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Contato save(@RequestBody Contato contato) {
        return contatoRepository.save(contato);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@PathVariable String id, @RequestBody Contato contato) {
        contatoRepository.findById(id)
                .map(c -> {
                    contato.setId(c.getId());
                    contatoRepository.save(contato);
                    return contato;
                }).orElseThrow(() -> new RuntimeException("Contato não encontrado"));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable String id){
        contatoRepository.findById(id)
                .map(c -> {
                    contatoRepository.delete(c);
                    return Void.TYPE;
                }).orElseThrow(() -> new RuntimeException("Contato não encontrado"));
    }

    @GetMapping
    List<Contato> getAll() {
        return contatoRepository.findAll();
    }

}
