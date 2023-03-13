public class Kart {
    /*
    * Motor é uma classe congregada a classe Kart, ou seja, Motor tem que ser acessada
    pela classe Kart
    * Piloto é uma classe agregada à classe Kart, ou seja, a classe Piloto pode
    existir sem a classe "prinvipal" Kart
    */

    // declaração de var
    String nome;    // nome do Kart
    Motor motor;    // instanciando o acesso à classe Motor
    Piloto piloto;  // utilizando o valores, da classe Piloto, que foram atrelados a classe Motor

    // métodos da Classe Kart
    public Kart(){      // congregação da classe Motor na classe Kart
        motor = new Motor();
    }

    void pula(){        // faz o Kart pular

        System.out.println("O kart pulou!!!");

    }

    void soltarTurbo(){  // solta o turbo do Kart

        System.out.println("Soltando o Turbo!!!!");

    }

    void fazerDrift(){   // Faz o Kart fazer Drift

        System.out.println("O Kart está fazendo Drift!!!");

    }


}
