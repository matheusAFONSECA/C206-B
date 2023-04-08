package br.inatel.cdg.jogador;

// importando os pacotes com as classes que vai auxiliar
import br.inatel.cdg.bloco.Bloco;

public class Jogador extends Bloco{
    // Código que simula a lógica de um bloco no jogo Arkanoid
    String nome;        // nome do jogador
    int pontuacao;      // pontuacao do jogador

    // construtor
    public Jogador(String nome) {
        this.nome = nome;
    }

    // metodos
    public void mostraInfo(){
        System.out.println("INFORMAÇÕES DO JOGADOR");
        System.out.println("Nome: " + nome);
        mostraInfoDestruidos();
        mostraInfoRestantes();
    }

    // metodos da outra classe
    @Override
    public void destruirBlocos() {
        super.destruirBlocos();
        pontuacao++;    // aumenta a quantidade de pontos
    }
}
