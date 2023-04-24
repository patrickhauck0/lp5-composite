package org.example.composite;

public class Jornal {
    private Materia noticia;

    public void setNoticia(Materia noticia) {
        this.noticia = noticia;
    }

    public String getNoticia() {
        if (this.noticia == null) {
            throw new NullPointerException("Jornal sem noticia");
        }
        return this.noticia.getMateria();
    }

}
