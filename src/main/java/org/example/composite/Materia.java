package org.example.composite;

public abstract class Materia {
    private String titulo;

    public Materia(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract String getMateria();
}
