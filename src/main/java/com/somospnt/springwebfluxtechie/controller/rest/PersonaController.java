package com.somospnt.springwebfluxtechie.controller.rest;

import com.somospnt.springwebfluxtechie.domain.Persona;
import com.somospnt.springwebfluxtechie.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    PersonaService personaService;

     @GetMapping("/personas-flux")
    public Flux<Persona> obtenerPersonasFlux(){
         return personaService.buscarTodasFlux();
     }

    @GetMapping("/personas-bloqueante")
    public List<Persona> obtenerPersonasBloqueante(){
        return personaService.buscarTodasBloqueante();
    }
}
