public class Main {
    // Aula de polimorfismo e herança
    public static void main(String[] args) {

        BrownieCafe brownieCafe = new BrownieCafe("CAFE", 20, "cafe");
        brownieCafe.mostraInfo();
        brownieCafe.addCarrinhoDeCompras();
        brownieCafe.adicionaCafe();
        brownieCafe.calculaValorTotalCompra();

        BrownieNutella brownieNutella = new BrownieNutella("NUTELLA", 15, "nutella");
        brownieNutella.mostraInfo();
        brownieNutella.addCarrinhoDeCompras();
        brownieNutella.adicionaNutella();
        brownieNutella.calculaValorTotalCompra();

        BrownieDoceDeLeite brownieDoceDeLeite= new BrownieDoceDeLeite("DOCE", 10, "doce de leite");
        brownieDoceDeLeite.mostraInfo();
        brownieDoceDeLeite.addCarrinhoDeCompras();
        brownieDoceDeLeite.adicionaDoceDeLeite();
        brownieDoceDeLeite.calculaValorTotalCompra();
    }
}