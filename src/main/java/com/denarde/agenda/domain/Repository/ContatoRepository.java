package com.denarde.agenda.domain.Repository;

import com.denarde.agenda.domain.Entity.Contato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContatoRepository extends MongoRepository<Contato, String> {
}
