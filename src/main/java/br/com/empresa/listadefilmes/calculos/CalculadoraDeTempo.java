package org.example.screenmatch.calculos;

import org.example.screenmatch.Filme;
import org.example.screenmatch.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluirTempo(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
