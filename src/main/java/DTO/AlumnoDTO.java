package DTO;

import Model.Asignatura;

import java.util.ArrayList;

public class AlumnoDTO {
    private String nombre;
    private ArrayList<AsignaturaDTO> asignaturas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<AsignaturaDTO> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<AsignaturaDTO> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
