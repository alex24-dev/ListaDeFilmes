package br.com.empresa.listadefilmes.dominio;


import br.com.empresa.listadefilmes.calculos.Classificavel;

public class Filme extends Titulo  implements Classificavel {

    private String diretor;
    public Filme(String nome) {
        super(nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) retornarMedia()/2 ;
    }
}
