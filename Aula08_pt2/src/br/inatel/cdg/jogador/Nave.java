package br.inatel.cdg.jogador;
import br.inatel.cdg.inimigo.Asteroide;

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
    public void atirar(Asteroide ast){       // faz a nave atirar no asteroide

        /*
        * Caso o asteroide seja do tipo grande e a nave não tenha a um tipo de tiro
        explosivo não ocorre a destruição do asteroide
        */
        if (ast.getTipoAsteroide().equals("GRANDE")) {
            if (tipoTiro.equals("EXPLOSIVO")) {
                ast.destruir();
            }
            if (tipoTiro.equals("NORMAL")) {
                System.out.println("Não é possivel destruir esse asteroide");
            }
        } else {
            ast.destruir();
        }

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
