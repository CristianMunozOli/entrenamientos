package com.entrenamientos.entrenamientos.jugador.infrastructure.data;

import com.entrenamientos.entrenamientos.DBConnection;
import com.entrenamientos.entrenamientos.jugador.domain.Jugador;
import com.entrenamientos.entrenamientos.jugador.domain.JugadorRepository;

import java.sql.PreparedStatement;
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

    @Override
    public Jugador muestraJugador(String dni) {
        Jugador jugador = null;
        try {
            Statement statement = DBConnection.getInstance().createStatement();
            String query = "select * from jugador where dni='" + dni + "';";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                jugador = new Jugador(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getDate("fechaNacimiento"),
                        rs.getInt("recuperacion"),
                        rs.getInt("resistencia"),
                        rs.getInt("velocidad")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return jugador;
    }


    public void guardar(Jugador jugador) {
        java.util.Date utildate = jugador.getFechaNacimiento();
        java.sql.Date sqlDate = new java.sql.Date(utildate.getTime());
        try {

            PreparedStatement statement =
                    DBConnection.getInstance().prepareStatement("insert into jugador(dni,nombre,apellidos,fechaNacimiento,recuperacion,resistencia,velocidad) values"+"(?,?,?,?,?,?,?)");
                    statement.setString(1,jugador.getDni());
                    statement.setString(2, jugador.getNombre());
                    statement.setString(3,jugador.getApellidos());
                    statement.setDate(4,sqlDate);
                    statement.setInt(5,jugador.getRecuperacion());
                    statement.setInt(6,jugador.getResistencia());
                    statement.setInt(7,jugador.getVelocidad());
                    statement.execute();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


    }

  /*  @Override
    public String actualizar(String dni) {
        return null;
    }*/
}
