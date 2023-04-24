package org.example.composite;

import java.util.Date;

public class Cabecalho extends Materia {
    private String dataPublicacao;

    public Cabecalho(String titulo, String dataPublicacao) {
        super(titulo);
        this.dataPublicacao = dataPublicacao;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getMateria() {
        return "Matéria: " + this.getTitulo() + " - data de publicação: " + this.dataPublicacao + "\n";
    }
}
