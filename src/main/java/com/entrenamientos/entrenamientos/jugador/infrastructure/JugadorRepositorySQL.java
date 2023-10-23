package com.entrenamientos.entrenamientos.jugador.infrastructure;

import com.entrenamientos.entrenamientos.jugador.domain.Jugador;
import com.entrenamientos.entrenamientos.jugador.domain.JugadorRepository;

import java.util.ArrayList;
import java.util.List;

public class JugadorRepositorySQL implements JugadorRepository {

    private List<Jugador> jugador;
    public JugadorRepositorySQL(){
        this.jugador = new ArrayList<>();
    }
    @Override
    public List<Jugador> listaJugadores() {
        return this.jugador;
    }

    /*7@Override
    public List<Jugador> muestraJugador(Integer dni) {
        return null;
    }

    @Override
    public Jugador guardar(Jugador jugador) {
        return null;
    }

    @Override
    public String actualizar(String dni) {
        return null;
    }*/
}
