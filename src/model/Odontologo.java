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

<<<<<<< HEAD
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

=======
>>>>>>> 43f96ca0169dece11a0f72bed9b2e77ea7d8a18f
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

<<<<<<< HEAD
=======
    public String getApellido() {
        return apellido;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

>>>>>>> 43f96ca0169dece11a0f72bed9b2e77ea7d8a18f
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
