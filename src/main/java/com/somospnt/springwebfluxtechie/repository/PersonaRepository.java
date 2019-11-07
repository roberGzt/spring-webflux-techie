package com.somospnt.springwebfluxtechie.repository;

import com.somospnt.springwebfluxtechie.domain.Persona;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

@Repository
public class PersonaRepository {
    private final List<Persona> personas = List.of(
            new Persona(1L, "Ana"),
            new Persona(2L, "Pedro"),
            new Persona(3L, "Pepe"),
            new Persona(4L, "Pepa"),
            new Persona(5L, "Gabo"));

    public Flux<Persona> buscarTodasFlux() {
        return Flux.fromIterable(personas).delaySequence(Duration.ofMillis(100L));
    }

    public List<Persona> buscarTodasBloqueante() {
        try {
            Thread.sleep(500L);
        } catch (Exception e) {
        }
        return personas;
    }
}
