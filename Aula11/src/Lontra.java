public class Lontra extends Mamifero implements Aquatico{

    // construtor
    public Lontra(String nome, double vida) {
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

        System.out.println("INFORMAÇÕES DA LONTRA: ");
        super.mostraInfo();
        System.out.println("---------------------------");

    }
    @Override
    public void nadar() {

        System.out.println(getNome() + " ESTÁ NADANDO!!!!");
        System.out.println("---------------------------");

    }

}
