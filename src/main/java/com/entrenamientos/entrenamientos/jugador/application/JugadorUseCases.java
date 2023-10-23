package com.entrenamientos.entrenamientos.jugador.application;

import com.entrenamientos.entrenamientos.jugador.domain.Jugador;
import com.entrenamientos.entrenamientos.jugador.domain.JugadorRepository;

import java.util.List;

public class JugadorUseCases {
    private final JugadorRepository jugadorRepository;
    public JugadorUseCases(JugadorRepository jugadorRepository){
        this.jugadorRepository=jugadorRepository;
    }
    public List<Jugador> listaJugadores(){
        return this.jugadorRepository.listaJugadores();
    }
    public Jugador muestraJugador(String dni){
        return this.jugadorRepository.muestraJugador(dni);
    }
    public void guardar(Jugador jugador){
         this.jugadorRepository.guardar(jugador);
    }
    /*public String actualizar(String dni){
        return this.jugadorRepository.actualizar(dni);
    }*/
}
