public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("ZEUS", 7);
        cachorro.mostraInfo();
        cachorro.emitirSom();

        Lontra lontra = new Lontra("JUJU", 15);
        lontra.mostraInfo();
        lontra.emitirSom();

        Boi boi = new Boi("ZE", 20);
        boi.mostraInfo();
        boi.emitirSom();

    }
}