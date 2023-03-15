import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração de var e instanciação de objetos
        Kart kart1 = new Kart();    // kart1
        Kart kart2 = new Kart();    // kart2

        Piloto p1 = new Piloto();   // piloto 1
        Piloto p2 = new Piloto();   // piloto 2

        // definindo o Scanner de entrada de dados
        Scanner entrada = new Scanner(System.in);

        // Piloto 1 será um vilão e o Piloto 2 não
        p1.vilao = true;
        System.out.println("Qual o nome do vilão? ");
        p1.nome = entrada.nextLine();
        kart1.nome = "Kartvil";

        p2.vilao = false;
        System.out.println("Qual o nome do herói? ");
        p2.nome = entrada.nextLine();
        kart1.nome = "Karteroi";

        // definindo qual kart cada um irá dirigir
        kart1.piloto = p1;
        kart2.piloto = p2;

        // definindo as especificações do motor
        System.out.println("Quantas cilindradas tem o motor do " + p1.nome + ":");
        kart1.motor.cilindradas = entrada.nextLine();
        if(!Objects.equals(kart1.motor.cilindradas, "50")){
            if(!Objects.equals(kart1.motor.cilindradas, "100")){
                if(!Objects.equals(kart1.motor.cilindradas, "150")){
                    System.out.println("Valor de cilindradas inválido, entre novamente com o valor: ");
                    kart1.motor.cilindradas = entrada.nextLine();
                }
            }
        }

        System.out.println("Quantas cilindradas tem o motor do " + p2.nome + ":");
        kart2.motor.cilindradas = entrada.nextLine();
        if(!Objects.equals(kart2.motor.cilindradas, "50")){
            if(!Objects.equals(kart2.motor.cilindradas, "100")){
                if(!Objects.equals(kart2.motor.cilindradas, "150")){
                    System.out.println("Valor de cilindradas inválido, entre novamente com o valor: ");
                    kart1.motor.cilindradas = entrada.nextLine();
                }
            }
        }

        // definindo a velocidade dos motores
        System.out.println("Qual a velocidade que tem o motor do " + p1.nome + ":");
        kart1.motor.velocidadeMaxima = entrada.nextInt();
        if(kart1.motor.velocidadeMaxima < 0 || kart1.motor.velocidadeMaxima > 150){
            System.out.println("Velocida inválida, declare novamemte o valor:");
            kart1.motor.velocidadeMaxima = entrada.nextInt();
        }

        System.out.println("Qual a velocidade que tem o motor do " + p2.nome + ":");
        kart2.motor.velocidadeMaxima = entrada.nextInt();
        if(kart2.motor.velocidadeMaxima < 0 || kart2.motor.velocidadeMaxima > 150){
            System.out.println("Velocida inválida, declare novamemte o valor:");
            kart1.motor.velocidadeMaxima = entrada.nextInt();
        }

    }
}
