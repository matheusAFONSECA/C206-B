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

        computadors[0].mostraPCConfigs();



    }
}