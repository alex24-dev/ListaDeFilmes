package br.com.empresa.listadefilmes.calculos;


import br.com.empresa.listadefilmes.dominio.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluirTempo(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
