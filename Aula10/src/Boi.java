public class Boi extends Mamifero{

    // construtor
    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    // metodos
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " ESTA EMITINDO UM BARULHO!");
        System.out.println("---------------------------");
    }

    @Override
    public void mostraInfo() {

        System.out.println("INFORMAÇÕES DO BOI:");
        super.mostraInfo();
        System.out.println("---------------------------");

    }
}
