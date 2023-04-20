public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("ZEUS", 7);
        cachorro.mostraInfo();
        cachorro.emitirSom();

        Lontra lontra = new Lontra("VIVI", 19);
        lontra.mostraInfo();
        lontra.emitirSom();
        lontra.nadar();

        Boi boi = new Boi("ZE", 15);
        boi.mostraInfo();
        boi.emitirSom();

    }
}