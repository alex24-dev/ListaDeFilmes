package br.com.empresa.listadefilmes.dominio;

import br.com.empresa.listadefilmes.calculos.CalculadoraDeTempo;
import br.com.empresa.listadefilmes.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme batman = new Filme();
        batman.setNome("Batman");
        batman.setDataDeLancamento(2020);
        batman.setDuracaoEmMinutos(60);

        batman.exibeFichaTecnica();
        batman.avaliar(8.1);
        batman.avaliar(9.1);

        System.out.println(batman.retornarMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setDataDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorTemporada(50);
        System.out.println("Duracação da serie " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora  = new CalculadoraDeTempo();
        calculadora.incluirTempo(batman);
        System.out.println(calculadora.getTempoTotal() +" " + batman.getNome());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(batman);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(batman);
        System.out.println("Tamanho da Lista " + listaFilmes.size());
        System.out.println("Nome do filme " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
        //System.out.println("toString " + listaFilmes.get(0).toString());

    }
}