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
    HardwareBasico hdb;         // hardware básico do computador

    public Computador(){
        sop = new SistemaOperacional();
        hdb = new HardwareBasico();
    }

    // metodos
    public void mostraPCConfigs(){      // mostra as configurações do PC

    }

    public void addMemoriaUSB(MemoriaUSB musb){     // adiciona a memoria USB extra

    }

}
