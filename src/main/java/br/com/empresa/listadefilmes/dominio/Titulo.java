package br.com.empresa.listadefilmes.dominio;

public class Titulo {

    private String nome;
    private int dataDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;

    private int totalDeAvaliacoes;

    private int duracaoEmMinutos;

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println(this.nome);
    }

    public void setDataDeLancamento(int dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getDataDeLancamento() {
        return dataDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme " + this.nome + " duração " + this.duracaoEmMinutos);
    }

    public void avaliar(Double nota){
        this.somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double retornarMedia(){
        double media = somaDasAvaliacoes/totalDeAvaliacoes;
        return media;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome();
    }
}
