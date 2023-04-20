public class Cachorro extends Mamifero{

    // construtor
    public Cachorro(String nome, double vida) {
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
        System.out.println("INFORMAÇÕES DO CACHORRO:");
        super.mostraInfo();
        System.out.println("---------------------------");
    }
}
