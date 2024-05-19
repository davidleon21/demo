package com.example.demo.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api")
public class Controlador {

    @Autowired
    private PersonajesServiceIMPL impl;

    @GetMapping("/allCharacters")
    public ResponseEntity<Flux<Personajes>> allCharacters() {
        Flux<Personajes> flux = this.impl.allCharacters();
        return new ResponseEntity<Flux<Personajes>>(flux, HttpStatus.OK);
    }

    @PostMapping("/addCharacters")
    public ResponseEntity<Mono<Personajes>> addCharacters(@RequestBody Personajes personajes){
        Mono<Personajes> mono=this.impl.addCharacters(personajes);
        return new ResponseEntity<Mono<Personajes>>(mono, HttpStatus.CREATED);
    }

    @PutMapping("/updateCharacters")
    public ResponseEntity<Mono<Personajes>> updateCharacters(@RequestBody Personajes personajes){
        Mono<Personajes> mono=this.impl.updateCharacters(personajes);
        return new ResponseEntity<Mono<Personajes>>(mono, HttpStatus.CREATED);
    }

    @GetMapping("/findCharacters/{id}")
    public ResponseEntity<Mono<Personajes>> findCharacters(@PathVariable  String id){
        Mono<Personajes> mono=this.impl.findCharacters(id);
        return new ResponseEntity<Mono<Personajes>>(mono, HttpStatus.OK);
    }

    @DeleteMapping("/deleteCharacters/{id}")
    public ResponseEntity<Mono<Void>> deleteCharacters(@PathVariable String id){
        Mono<Void> mono=this.impl.deleteCharacters(id);
        return new ResponseEntity<Mono<Void>>(mono, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteCharacters")
    public ResponseEntity<Mono<Void>> deleteCharacters(){
        Mono<Void> mono=this.impl.deleteallCharacters();
        return new ResponseEntity<Mono<Void>>(mono, HttpStatus.OK);
    }






}
