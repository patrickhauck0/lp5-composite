package org.example.composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JornalTest {

    @Test
    void deveRetornarJornalNoticia() {
        Paragrafo paragrafo1 = new Paragrafo("Medicina");

        Paragrafo paragrafo2 = new Paragrafo("Em alta");
        Cabecalho cabecalho21 = new Cabecalho("Ex-rainha da Oktoberfest processa evento e pede quase R$ 20 mil", "24/04/2023");
        paragrafo2.addMateria(cabecalho21);

        Paragrafo paragrafo3 = new Paragrafo("Futebol");
        Cabecalho cabecalho31 = new Cabecalho("Maracanã: Flamengo, Fluminense e governo contra-atacam Vasco na Justiça", "22/04/2023");
        Cabecalho cabecalho32 = new Cabecalho("Técnico diz que manifesto do Corinthians feminino não foi para Cuca", "18/03/2023");
        paragrafo3.addMateria(cabecalho31);
        paragrafo3.addMateria(cabecalho32);

        Paragrafo noticia = new Paragrafo("Noticias da Semana");
        noticia.addMateria(paragrafo1);
        noticia.addMateria(paragrafo2);
        noticia.addMateria(paragrafo3);

        Jornal jornal = new Jornal();
        jornal.setNoticia(noticia);

        assertEquals("Tópico: Noticias da Semana\n" +
                "Tópico: Medicina\n" +
                "Tópico: Em alta\n" +
                "Matéria: Ex-rainha da Oktoberfest processa evento e pede quase R$ 20 mil - data de publicação: 24/04/2023\n" +
                "Tópico: Futebol\n" +
                "Matéria: Maracanã: Flamengo, Fluminense e governo contra-atacam Vasco na Justiça - data de publicação: 22/04/2023\n" +
                "Matéria: Técnico diz que manifesto do Corinthians feminino não foi para Cuca - data de publicação: 18/03/2023\n", jornal.getNoticia());
    }

    @Test
    void deveRetornarExcecaoJornalSemNoticia() {
        try {
            Jornal jornal = new Jornal();
            jornal.getNoticia();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Jornal sem noticia", e.getMessage());
        }
    }
}