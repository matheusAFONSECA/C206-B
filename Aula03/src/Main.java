import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();  // atribuindo uma var o tipo Zumbi (instanciando a var como Zumbi)

        // entrada de dados
        Scanner entrada = new Scanner(System.in);

        //entrada do nome do zumbi e a quantida de vida do mesmo
        System.out.print("Defina o nome do zumbi: ");
        zumbi.nomeDoZumbi = entrada.nextLine();

        System.out.print("Defina a quantidade de vida do " + zumbi.nomeDoZumbi);
        zumbi.vida = entrada.nextInt();

        // chama o metodo que mostra o nome e vida do zumbi
        zumbi.statusDoZumbi();

        // fechamento do Scanner de entrada de dados
        entrada.close();

    }
}