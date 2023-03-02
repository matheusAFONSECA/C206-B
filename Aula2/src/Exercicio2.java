import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // declaracao de var
        float soma;          // guarda a soma de lanches
        int numero;          // quantidade de lanches consumidos na primeira hora
        int numero1;         // quantidade de lanches consumidos na segunda hora
        int numero2;         // quantidade de lanches consumidos na terceira hora
        float media = 0F;    // media dos lanches consumidos

        // entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual a quantidade de lanches consumidos na primeira hora: ");
        numero = entrada.nextInt();

        System.out.print("Qual a quantidade de lanches consumidos na segunda hora: ");
        numero1 = entrada.nextInt();

        System.out.print("Qual a quantidade de lanches consumidos na segunda hora: ");
        numero2 = entrada.nextInt();

        // soma da quantidade de lanches
        soma = numero + numero1 + numero2;
        System.out.println("Quantidade de lanches: " + soma);

        // media dos lanches consumidos
        media = soma / 3;
        System.out.printf("Media dos lanches consumidos: %.2f %n2" , media);  // mostra duas casas decimais

        // fechamento do Scanner de entrada de dados
        entrada.close();
    }
}
