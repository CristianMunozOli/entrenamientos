package com.entrenamientos.entrenamientos.jugador.domain;

import java.util.List;

public interface JugadorRepository {
    public List<Jugador> listaJugadores();
    public Jugador muestraJugador(String dni);
    public void guardar(Jugador jugador);

    public void borrarDatosTablaJugador();
    /*public String actualizar(String dni);*/
}
