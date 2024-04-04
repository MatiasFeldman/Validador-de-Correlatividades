package domain.alumno;

import domain.materia.Materia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Collections;
public class Alumno {
    private String legajo;
    private String nombre;
    private List<Materia> materiasAprobadas;

    public Alumno(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public boolean cumpleCorrelativas (Materia materia){
        return new HashSet<>(this.materiasAprobadas).containsAll(materia.getCorrelativas());
    }
}

