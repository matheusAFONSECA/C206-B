import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração de var e instanciando objetos
        Cliente cliente = new Cliente();    // cliente que vai comprar os computadores
        Computador[] computadors = new Computador[3];   // computadores que a loja oferece
        MemoriaUSB  memoriaUSB = new MemoriaUSB();      // Memoria externa

        /*
        * Os valores a seguir serão atribuidos agora sem a utilização de um Scanner porque eles
        foram dados previamente
        * computadores é uma Array de 3 posições somente pq serão usados somente 3 objetos do tipo Computador
        */
        // definindo os valores dos objetos
        // declarando as configurações do computador da Positivo -> opção 1
        computadors[0] = new Computador();
        computadors[0].marca = "Positivo";
        computadors[0].preco = 2300;
        computadors[0].hdb[0] = new HardwareBasico();
        computadors[0].hdb[0].nome = "Pentium Core i3";
        computadors[0].hdb[0].capacidade = 2200;
        computadors[0].hdb[1] = new HardwareBasico();
        computadors[0].hdb[1].nome = "Memoria RAM";
        computadors[0].hdb[1].capacidade = 8;
        computadors[0].hdb[2] = new HardwareBasico();
        computadors[0].hdb[2].nome = "HD";
        computadors[0].hdb[2].capacidade = 500;
        computadors[0].sop.nome = "Linux Ubuntu";
        computadors[0].sop.tipo = 32;
        // adicionando uma memoria USB
        memoriaUSB.nome = "Pen-drive";
        memoriaUSB.capacidade = 16;
        computadors[0].addMemoriaUSB(memoriaUSB);

        // declarando as configurações do computador da Acer -> opção 2
        computadors[1] = new Computador();
        computadors[1].marca = "Acer";
        computadors[1].preco = 5800;
        computadors[1].hdb[0] = new HardwareBasico();
        computadors[1].hdb[0].nome = "Pentium Core i5";
        computadors[1].hdb[0].capacidade = 3370;
        computadors[1].hdb[1] = new HardwareBasico();
        computadors[1].hdb[1].nome = "Memoria RAM";
        computadors[1].hdb[1].capacidade = 16;
        computadors[1].hdb[2] = new HardwareBasico();
        computadors[1].hdb[2].nome = "HD";
        computadors[1].hdb[2].capacidade = 1000;
        computadors[1].sop.nome = "Windows 8";
        computadors[1].sop.tipo = 64;
        // adicionando uma memoria USB
        memoriaUSB.nome = "Pend-drive";
        memoriaUSB.capacidade = 32;
        computadors[0].addMemoriaUSB(memoriaUSB);

        // declarando as configurações do computador da Vaio -> opção 3
        computadors[2] = new Computador();
        computadors[2].marca = "Vaio";
        computadors[2].preco = 1800;
        computadors[2].hdb[0] = new HardwareBasico();
        computadors[2].hdb[0].nome = "Pentium Core i7";
        computadors[2].hdb[0].capacidade = 4500;
        computadors[2].hdb[1] = new HardwareBasico();
        computadors[2].hdb[1].nome = "Memoria RAM";
        computadors[2].hdb[1].capacidade = 32;
        computadors[2].hdb[2] = new HardwareBasico();
        computadors[2].hdb[2].nome = "HD";
        computadors[2].hdb[2].capacidade = 2000;
        computadors[2].sop.nome = "Windows 10";
        computadors[2].sop.tipo = 64;
        // adicionando uma memoria USB
        memoriaUSB.nome = "HD Externo";
        memoriaUSB.capacidade = 1000;
        computadors[0].addMemoriaUSB(memoriaUSB);

        // agora começa a parte do menu do usuário
        // var auxilixares
        boolean flag = true;       // flag de controle do menu
        float precoTotal;          // preco total de compra do cliente
        int op;                    // operação que o cliente quer fazer

        // declarando um Scanner
        Scanner entrada = new Scanner(System.in);

        // entrando com as informações do cliente
        System.out.println("BEM VINDO(A) AO SISTEMA DE COMPRA DA PC MANIA");
        System.out.println("Antes de começarmos, precisamos saber o seu nome e CPF");
        System.out.print("Nome: ");
        cliente.nome = entrada.nextLine();
        System.out.print("CPF: ");
        cliente.cpf = entrada.nextLong();
        System.out.println("AGORA ESTAMOS PRONTOS PARA UTILIZAR O SISTEMA DE COMPRAS!!!");

        // iniciando a utilização do sistema
        while (flag){
            System.out.println("O QUE DESEJA FAZER?");
            System.out.println("0 - SAIR DO SISTEMA");
            System.out.println("1 - COMPRAR ALGUM COMPUTADOR DA PROMOÇÃO");
            System.out.println("2 - VER AS CONFIGURAÇÕES DOS COMPUTADORES DA PROMOÇÃO");
            op = entrada.nextInt();         // analisando qual a ação o cliente deseja fazer

            switch (op){
                case 0:     // sair do sistema da PC Mania
                    System.out.println("OBRIGADO POR USAR O SISTEMA DE COMPRAS DA PC MANIA!!!");
                    flag = false;   // sair do while
                    break;

                case 1:     // comprar algum pc da promoção
                    System.out.println("ESSAS SÃO AS OPÇÕES DE COMPRA: ");
                    System.out.println("1 - Positivo - R$2300,00");
                    System.out.println("2 - Acer - R$5800,00");
                    System.out.println("3 - Vaio - R$1800,00");
                    break;

                case 2:     // ver as configurações dos Computadores
                    System.out.println("AQUI ESTÃO AS CONFIGURAÇÕES DOS COMPUTADORES DA PROMOÇÃO");
                    for (int i = 0; i < computadors.length; i++){
                        computadors[i].mostraPCConfigs();
                    }
                    break;
            }

        }

        // fechando o Scanner
        entrada.close();

    }
}