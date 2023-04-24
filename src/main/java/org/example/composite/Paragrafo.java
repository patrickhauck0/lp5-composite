package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Paragrafo extends Materia {
    private List<Materia> materias;

    public Paragrafo(String titulo) {
        super(titulo);
        this.materias = new ArrayList<Materia>();
    }

    public void addMateria(Materia materia) {
        this.materias.add(materia);
    }

    public String getMateria() {
        String saida = "";
        saida = "Tópico: " + this.getTitulo() + "\n";
        for (Materia materia : materias) {
            saida += materia.getMateria();
        }
        return saida;
    }
}
