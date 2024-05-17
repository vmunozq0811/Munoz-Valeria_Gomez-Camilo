package model;

import java.time.LocalDate;

public class Odontologo {
    private Integer matricula;
    private String nombre;
    private String apellido;

    public Odontologo(String nombre, String apellido, String cedula, LocalDate fechaIngreso, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(Integer id, String nombre, String apellido, String cedula, LocalDate fechaIngreso, Domicilio domicilio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
