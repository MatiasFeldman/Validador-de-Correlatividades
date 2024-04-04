package domain.materia;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String materia;
    private List<Materia> correlativas;
    public Materia(String materia) {
        this.materia = materia;
        this.correlativas = new ArrayList<>();
    }
    public List<Materia> getCorrelativas() {
        return correlativas;
    }

}