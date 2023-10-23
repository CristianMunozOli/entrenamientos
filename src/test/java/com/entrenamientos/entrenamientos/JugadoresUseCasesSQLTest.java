package com.entrenamientos.entrenamientos;

import com.entrenamientos.entrenamientos.jugador.application.JugadorUseCases;
import com.entrenamientos.entrenamientos.jugador.domain.Jugador;
import com.entrenamientos.entrenamientos.jugador.infrastructure.data.JugadorRepositorySQL;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        List<Jugador> jugadores = this.jugadorUseCases.listaJugadores();
        assertEquals(,jugadores.size());
    }
    @Test
    void muestraJugador(){
        String dni="12345678x";
        //Jugador insertar = new Jugador()
        Jugador jugador = this.jugadorUseCases.muestraJugador(dni);
        assertEquals(jugador.getDni(),dni);
    }
    @Test
    void  guardar(){

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String dateInString = "1989-10-30";
            Date date = formatter.parse(dateInString);
            this.jugadorUseCases.guardar(new Jugador("18057241x","cristian","muñoz",date,1,1,1));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        List<Jugador> jugadores = this.jugadorUseCases.listaJugadores();
        assertEquals(1,jugadores.size());
    }
    @AfterEach
    void muestraJugadorLimpiar(){

    }


}
