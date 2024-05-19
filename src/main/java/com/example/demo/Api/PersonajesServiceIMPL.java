package com.example.demo.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonajesServiceIMPL {


    @Autowired
    private PersonajesRepo personajesRepo;

    //flux es para listas
    public Flux<Personajes> allCharacters(){
        return this.personajesRepo.findAll();
    }
    //mono para un proceso
    public Mono<Personajes> addCharacters(Personajes personajes){
        return this.personajesRepo.save(personajes);

    }

    public Mono<Personajes> updateCharacters(Personajes personajes){
        return this.personajesRepo.save(personajes);

    }
    public Mono<Personajes> findCharacters(String id){
        return this.personajesRepo.findById(id);

    }
    public Mono<Void> deleteCharacters(String id){
        return this.personajesRepo.deleteById(id);

    }
    public Mono<Void> deleteallCharacters(){
        return this.personajesRepo.deleteAll();

    }





}
