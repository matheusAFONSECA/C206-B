import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // declaracao de var
        int NPA;    // nota de aproveitamento
        int NP1;    // nota da p1
        int NP2;    // nota da p2
        int NP3;    // nota da NP3

        // entrada das notas
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a sua nota na NP1: ");
        NP1 = entrada.nextInt();

        System.out.print("Qual a sua nota na NP2: ");
        NP2 = entrada.nextInt();

        // saida de NPA
        NPA = (NP1 + NP2) / 2;
        System.out.println("Sua NPA foi de: " + NPA);

        // estrutura de decisao para aprovacao direta ou NP3
        if (NPA < 60) {
            System.out.println("VOCE PRECISA FAZER A NP3");

            // entrada da nota de NP3
            System.out.print("Qual a sua nota na NP3: ");
            NP3 = entrada.nextInt();

            NPA = (NPA + NP3) / 2;

            // aprovacao ou reprovacao
            if (NPA >= 50) {
                System.out.println("VOCÊ FOI APROVADO");
            } else {
                System.out.println("VOCÊ FOI REPROVADO");
            }
        } else {
            System.out.println("VOCÊ FOI APROVADO");
        }

        // fechamento do Scanner de entrada de dados
        entrada.close();

    }
}
