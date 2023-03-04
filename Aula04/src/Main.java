public class Main {
    public static void main(String[] args) {
        // declaracao de var e instanciacao
        Zumbi zumbi1 = new Zumbi();     // primeiro zumbi
        Zumbi zumbi2 = new Zumbi();     // segundo zumbi

        zumbi1.nome = "Muchacho";
        zumbi2.nome = "Muho";

        // definindo a vida de ambos os zumbis
        zumbi1.vida = 1000;
        zumbi2.vida = 1500;
        zumbi1.mostraVida();
        zumbi2.mostraVida();

        // igualando o valor da vida dos zumbis e manipulando
        zumbi1.vida = 900;
        zumbi2.vida = 1250;
        zumbi1.mostraVida();
        zumbi2.mostraVida();

        zumbi1 = zumbi2;

        zumbi1.vida = 800;
        zumbi2.vida = 1400;
        zumbi1.mostraVida();
        zumbi2.mostraVida();

        zumbi1.vida = 800;
        zumbi2.mostraVida();
    }
}