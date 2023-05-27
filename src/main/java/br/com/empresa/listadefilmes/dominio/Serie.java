package org.example.screenmatch;

public class Serie extends Titulo{

    private int temporada;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorTemporada;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporadas(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorTemporada() {
        return minutosPorTemporada;
    }

    public void setMinutosPorTemporada(int minutosPorTemporada) {
        this.minutosPorTemporada = minutosPorTemporada;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * episodiosPorTemporada * minutosPorTemporada;
    }
}
