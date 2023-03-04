import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // declaracao de var e instanciacao
        Zumbi zumbi1 = new Zumbi();     // primeiro zumbi
        Zumbi zumbi2 = new Zumbi();     // segundo zumbi
        boolean verifica;               // var aux
        double quantia;                  // quantia de vida que vau ser transferida

        // definindo a vida de ambos os zumbis
        zumbi1.vida = 1000;
        zumbi2.vida = 1500;
        zumbi1.nome = "Muchacho";
        zumbi2.nome = "Muho";
        zumbi1.mostraVida();
        zumbi2.mostraVida();

        // quantia de vida que vai ser tranferida
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a quantidade de vida que " + zumbi1.nome + " vai transferir para " + zumbi2.nome + ":");
        quantia = entrada.nextDouble();


        // tranfirindo a vida de um zumbi1 para o outro
        verifica = zumbi1.tranfereVida(zumbi2, quantia);
        if(verifica){
            System.out.println("A tranferencia de vida deu certo!");

            zumbi1.mostraVida();
            zumbi2.mostraVida();
        } else {
            System.out.println("Não foi possivel transferir...");
        }

    }
}
