public class Kart {
    /*
    * Motor é uma classe congregada a classe Kart, ou seja, Motor tem que ser acessada
    pela classe Kart
    * Piloto é uma classe agregada à classe Kart, ou seja, a classe Piloto pode
    existir sem a classe "prinvipal" Kart
    */

    // declaração de var
    Motor motor;  // instanciando o acesso à classe Motor
    Piloto piloto;  // utilizando o valores, da classe Piloto, que foram atrelados a classe Motor

    public Kart(){
        motor = new Motor();
    }
}
