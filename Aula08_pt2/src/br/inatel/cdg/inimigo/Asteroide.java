package br.inatel.cdg.inimigo;

public class Asteroide {
    // classe que guarda os atributos e metodos do objeto Asteroide
    //Atributos
    private String nome;            // nome do asteiroide
    private String tipoAsteroide;   // tipo do asteroide

    // construtor
    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    // metodo
    public void destruir(){     // faz o asteroide ser destruido

    }

    // getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public void setTipoAsteroide(String tipoAsteroide) {
        this.tipoAsteroide = tipoAsteroide;
    }
}
