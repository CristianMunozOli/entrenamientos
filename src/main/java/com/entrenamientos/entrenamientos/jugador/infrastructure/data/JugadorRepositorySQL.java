package com.entrenamientos.entrenamientos.jugador.infrastructure.data;

import com.entrenamientos.entrenamientos.DBConnection;
import com.entrenamientos.entrenamientos.jugador.domain.Jugador;
import com.entrenamientos.entrenamientos.jugador.domain.JugadorRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JugadorRepositorySQL implements JugadorRepository {

    public JugadorRepositorySQL(){ }
    @Override
    public List<Jugador> listaJugadores() {
        List<Jugador> jugadores = new ArrayList<>();
         try {
            Statement statement = DBConnection.getInstance().createStatement();
            ResultSet rs = statement.executeQuery("select * from jugador");
            while(rs.next()){
                Jugador jugador = new Jugador(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getDate("fechaNacimiento"),
                        rs.getInt("recuperacion"),
                        rs.getInt("resistencia"),
                        rs.getInt("velocidad")
                );
                jugadores.add(jugador);
            }
        } catch (SQLException e) {
             System.err.println(e.getMessage());
        }
        return jugadores;
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
