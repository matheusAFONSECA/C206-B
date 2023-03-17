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

        // declaração de Scanner
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.println("BEM VINDO AO SISTEMA DA CANTINA, O QUE GOSTARIA DE FAZER?");
        while (flag){
            System.out.println("1 - ADICIONAR UM SALGADO À CANTINA");
            System.out.println("2 - VER OS SALGADOS DISPONÍVEIS");
            System.out.println("3 - SAIR DO SISTEMA");
            var = entrada.nextInt();    // entrada de uma var aux

            switch (var) {
                case 1 -> {     // adicionar um salgado ao sistema
                    entrada.nextLine();
                    System.out.println("Fale o nome do salgado: ");
                    Salgado salgado = new Salgado();    // instanciando um tipo de salgado
                    salgado.nome = entrada.nextLine();
                    cantina.addSalgado(salgado);        // adicionando o salgado na cantina
                }
                case 2 -> cantina.mostraInfo();     // mostrar as informações do cardapio
                case 3 -> {     // caso deseje sair do sistema
                    System.out.println("Obrigado por utilizar o sistema, até mais!");
                    flag = false;
                }
                default -> System.out.println("Entre com um número válido!!!!");
            }
        }

        // fechamento do Scanner de entrada de dados
        entrada.close();
    }
}