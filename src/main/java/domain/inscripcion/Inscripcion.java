package domain.inscripcion;

import domain.alumno.Alumno;
import domain.materia.Materia;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public boolean aprobada(Materia materia){
     return this.materias.stream().allMatch(m -> alumno.cumpleCorrelativas(materia));
    }
}
