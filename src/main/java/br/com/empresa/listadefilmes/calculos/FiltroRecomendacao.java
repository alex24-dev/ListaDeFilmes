package br.com.empresa.listadefilmes.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliados");
        }else
            System.out.println("Coloque na sua lista");
    }
}
