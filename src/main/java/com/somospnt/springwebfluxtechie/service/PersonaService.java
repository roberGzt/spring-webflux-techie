package com.somospnt.springwebfluxtechie.service;

import com.somospnt.springwebfluxtechie.domain.Persona;
import com.somospnt.springwebfluxtechie.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public Flux<Persona> buscarTodasFlux(){
        return personaRepository.buscarTodasFlux();
    }

    public List<Persona> buscarTodasBloqueante(){
        return personaRepository.buscarTodasBloqueante();
    }
}
