import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // AULA SOBRE ARRAYS
        // instanciando as var e arrays
        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";
//        Salgado[] salgado = new Salgado[20];   // array de salgados

        boolean flag = true;    // flag de controle do while
        int var;                // var aux
        int i = 0;              // controle

        // declaração de Scanner
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.println("BEM VINDO AO SISTEMA DA CANTINA, O QUE GOSTARIA DE FAZER?");
        while (flag){
            System.out.println("1 - ADICIONAR UM SALGADO À CANTINA");
            System.out.println("2 - VER OS SALGADOS DISPONÍVEIS");
            System.out.println("3 - SAIR DO SISTEMA");
            var = entrada.nextInt();

            switch (var){
                case 1:
                    entrada.nextLine();
                    System.out.println("Fale o nome do salgado: ");
                    Salgado salgado = new Salgado();
                    salgado.nome = entrada.nextLine();
                    cantina.addSalgado(salgado);
                    i++;
                    break;
                case 2:
                    cantina.mostraInfo();
                    break;
                case 3:
                    System.out.println("Obrigado por utilizar o sistema, até mais!");
                    flag = false;
                    break;
                default:
                    System.out.println("Entre com um número válido!!!!");
                    break;
            }
        }
    }
}