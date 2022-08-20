package com.denarde.agenda.domain.Repository;

import com.denarde.agenda.domain.Entity.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {
}
