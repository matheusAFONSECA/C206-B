public class Personagem {
    // Nesse exercício vamos fazer uma agregação entre a classe Arma e Personagem

    String nome;
    int pontos;
    Arma arma;

    void usaArma(){
        arma.resistencia -= 2;
    }

    void tomarDano(){
        pontos -= 5;
    }

}
