package com.entrenamientos.entrenamientos;

import com.entrenamientos.entrenamientos.jugador.application.JugadorUseCases;
import com.entrenamientos.entrenamientos.jugador.domain.Jugador;
import com.entrenamientos.entrenamientos.jugador.infrastructure.data.JugadorRepositorySQL;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JugadoresUseCasesSQLTest {
    JugadorUseCases jugadorUseCases;
    public JugadoresUseCasesSQLTest(){
        this.jugadorUseCases = new JugadorUseCases(
                new JugadorRepositorySQL()
        );
    }
    @Test
    void listaJugadores(){
        List<Jugador> jugador = this.jugadorUseCases.listaJugadores();
        assertEquals(2,jugador.size());
    }

}
