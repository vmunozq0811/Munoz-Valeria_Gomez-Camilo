package model;

import java.time.LocalDate;

public class Odontologo {
    private Integer Id;
    private String matricula;
    private String nombre;
    private String apellido;

    public Odontologo(String nombre, String apellido, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }


    public Odontologo(Integer Id, String nombre, String apellido, String matricula) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
