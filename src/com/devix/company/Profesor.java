package com.devix.company;

/**
 * Created by carlosjoseanguiano on 24/04/17.
 */
public class Profesor extends Persona {

    private String idProfesor;

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        idProfesor = "UnKnown";
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void mostrarNME() {
        System.out.println("Profesor de nombre " + getNombre()
                + " " + getApellido() + " " + getEdad() + " Años "+"con el ID " + idProfesor);
    }
}
