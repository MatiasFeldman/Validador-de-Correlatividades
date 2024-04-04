package domain;

import domain.alumno.Alumno;
import domain.inscripcion.Inscripcion;
import domain.materia.Materia;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CorrelativasTest {
    // Test que verifica que una materia sin correlativas se aprueba
    @Test
    public void testAprobadaSinCorrelativas() {
        Alumno alumno = new Alumno("134566655", "Matias");
        Inscripcion inscripcion = new Inscripcion(alumno);
        Materia materia = new Materia("Algoritmos");
        assertTrue(inscripcion.aprobada(materia));
    }

    // Test que verifica que una materia con correlativas se aprueba si el alumno las tiene aprobadas
    @Test
    public void testAprobadaConCorrelativas() {
        Alumno alumno = new Alumno("13455634", "tomas");
        Inscripcion inscripcion = new Inscripcion(alumno);
        Materia materia = new Materia("Algoritmos");
        Materia correlativa = new Materia("Matematica");
        materia.getCorrelativas().add(correlativa);
        assertTrue(inscripcion.aprobada(materia));
    }

    // Test que verifica que una materia con correlativas no se aprueba si el alumno no las tiene aprobadas
    @Test
    public void testNoAprobadaConCorrelativas() {
        Alumno alumno = new Alumno("456353455", "Ignacion");
        Inscripcion inscripcion = new Inscripcion(alumno);
        Materia materia = new Materia("Algoritmos");
        Materia correlativa = new Materia("Matematica");
        materia.getCorrelativas().add(correlativa);
        assertFalse(inscripcion.aprobada(materia));
    }
}
