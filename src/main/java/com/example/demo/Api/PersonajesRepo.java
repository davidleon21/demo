package com.example.demo.Api;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajesRepo extends ReactiveMongoRepository<Personajes, String> {
}
