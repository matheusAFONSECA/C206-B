package br.inatel.cdg.jogador;

public class Nave {
    // classe que guarda os atributos e metodos do objeto Nave
    // atributos
    private String nome;        // nome da nave
    private double vida;        // vida da nave
    private String tipoTiro;    // tipo de tiro da nave

    // construtor
    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    // metodo
    public void atirar(){       // faz a nave atirar no asteroide

    }

    // getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    public void setTipoTiro(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }
}
