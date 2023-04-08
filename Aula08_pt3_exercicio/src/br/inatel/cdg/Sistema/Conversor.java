package br.inatel.cdg.Sistema;

public class Conversor{
    // classe responsável por fazer a conversão de pontuação entre a relação entre jogador
    // e blocos

    // metodo que retorna a pontuação do jogador
    public void mostraPontuacao(int pontuacao){
        pontuacao *= 2;
        System.out.println("Pontuacao: " + pontuacao);
        System.out.println("Moedas: " + pontuacao*100);

    }
}
