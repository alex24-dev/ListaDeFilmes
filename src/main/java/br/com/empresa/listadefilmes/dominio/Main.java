package br.com.empresa.listadefilmes.dominio;

import br.com.empresa.listadefilmes.calculos.CalculadoraDeTempo;
import br.com.empresa.listadefilmes.calculos.FiltroRecomendacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Filme batman = new Filme("Batman");
       // batman.setNome("Batman");
        batman.setDataDeLancamento(2020);
        batman.setDuracaoEmMinutos(60);

        batman.exibeFichaTecnica();
        batman.avaliar(8.1);
        batman.avaliar(9.1);

        System.out.println(batman.retornarMedia());

        Serie lost = new Serie("Lost");
        //lost.setNome("Lost");
        lost.setDataDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorTemporada(50);

        Filme avatar = new Filme("Avatar");
        avatar.setDataDeLancamento(2023);

        System.out.println(lost.getNome());
        System.out.println("Duracação da serie " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora  = new CalculadoraDeTempo();
        calculadora.incluirTempo(batman);
        System.out.println(calculadora.getTempoTotal() +" " + batman.getNome());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(batman);

        List<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(batman);
        listaDeTitulos.add(lost);
        listaDeTitulos.add(avatar);

        System.out.println("Tamanho da Lista " + listaDeTitulos.size());
        System.out.println("Nome do filme " + listaDeTitulos.get(0).getNome());
        System.out.println(listaDeTitulos);
        //System.out.println("toString " + listaFilmes.get(0).toString());
        System.out.println("-------------------------");

        for (Titulo titulo: listaDeTitulos) {
            System.out.println(titulo);
        }

        Collections.sort(listaDeTitulos);
        System.out.println("---------------");
        System.out.println(listaDeTitulos);

        System.out.println("---------------------------");
        System.out.println("Comparando ordem de lancamento");
        listaDeTitulos.sort(Comparator.comparing(Titulo::getDataDeLancamento));
        System.out.println(listaDeTitulos);

    }
}