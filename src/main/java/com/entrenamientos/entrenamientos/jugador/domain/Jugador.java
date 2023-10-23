package com.entrenamientos.entrenamientos.jugador.domain;

import java.util.Date;

public class Jugador {
    private String nombre,apellidos,dni;
    private Date fechaNacimiento;
    private Integer recuperacion,resistencia,velocidad;

    public Jugador( String dni,String nombre,String apellidos , Date fechaNacimiento, Integer recuperacion, Integer resistencia, Integer velocidad) {
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.recuperacion = recuperacion;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getRecuperacion() {
        return recuperacion;
    }

    public void setRecuperacion(Integer recuperacion) {
        this.recuperacion = recuperacion;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}
