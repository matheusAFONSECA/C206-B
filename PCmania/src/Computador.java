public class Computador {
    // Outra classe principal para esse exercício
    // Computador é a classe que guarda as informações que são pertinentes ao Cliente
    // Responsável por guardar as informações dos PCs
    // Possui uma relação de agregação com a classe Cliente

    // atributos
    String marca;       // marca do computador
    float preco;        // preco do computador

    // classes que tem relação de congregação
    SistemaOperacional sop;     // sistema operacional do computador
    HardwareBasico[] hdb;         // hardware básico do computador

    // classe que tem relação de agregação
    MemoriaUSB memoriaUSB = new MemoriaUSB();   // memoria externa que acompanha o computador

    public Computador(){
        sop = new SistemaOperacional();
        hdb = new HardwareBasico[5];
    }

    // metodos
    public void mostraPCConfigs(){      // mostra as configurações do PC

        System.out.println("CONFIGURAÇÕES DO COMPUTADOR: " + marca);
        System.out.println("PREÇO: R$" + preco);
        System.out.println("HARDWARE: ");
        for (int i = 0; i < hdb.length; i++){
            if (hdb[i] != null){
                System.out.println(hdb[i].nome + " - " + hdb[i].capacidade);
            }
        }
        System.out.println("SISTEMA OPERACIONAL: " + sop.nome + " - " + sop.tipo);
        System.out.println("ACOMPANHA: " + memoriaUSB.nome + " - " + memoriaUSB.capacidade);
        System.out.println("---------------------------------------------------");
    }

    public void addMemoriaUSB(MemoriaUSB musb){     // adiciona a memoria USB extra
        memoriaUSB = musb;
    }

}
