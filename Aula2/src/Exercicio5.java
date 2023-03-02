import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // declaracao de var
        int random;     // numero randomico entre 1-10
        int num;        // numero digitado pelo usuario

        // definicao do numero randomico
        Random rand = new Random();
        random = rand.nextInt(10) + 1;    // gera numero entre 1-10

        // entrada do numero pelo usuario e resposta
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero que foi gerado: ");
        num = entrada.nextInt();

        // caso nao acerte o numero, faca outro chute
        while(num != random){
            System.out.println("Voce errou! Tente novamente...");
            System.out.print("Digite o numero que foi gerado: ");
            num = entrada.nextInt();
        }

        // caso acerte
        System.out.println("Voce acertou!");

        // fechamento do Scanner de entrada de dados
        entrada.close();

    }
}
