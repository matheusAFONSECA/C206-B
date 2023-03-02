import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // declaracao de var
        int alunos;     // quantidade de alunos na turma

        // entrada da quantidade de alunos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de alunos na turma: ");
        alunos = entrada.nextInt();

        // estrutura de decisao switch-case
        switch (alunos){
            case 10:
                System.out.println("Sala I-16");
                break;
            case 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Nao foi informado uma sala para essa quantidade");
                break;
        }

        // fechamento do Scanner de entrada de dados
        entrada.close();

    }
}
