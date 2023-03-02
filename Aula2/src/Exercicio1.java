public class Exercicio1 {
    public static void main(String[] args) {
        // declaracao de var
        int Primeira_hora = 10;  // primeira hora de  consumo
        int Segunda_hora = 4;    // segunda hora de consumo
        int Terceira_hora = 2;   // terceira hora de consumo
        int soma;                // guarda a soma dos lanches consumidos
        int media;               // media dos lanches consumidos por hora

        // soma dos lanches durante as tres horas
        soma = Primeira_hora + Segunda_hora + Terceira_hora;

        System.out.println("O total de lanches: " + soma);

        // media de lanches consumidos
        media = soma / 3;
        System.out.println("A media de lanches: " + media);
    }
}