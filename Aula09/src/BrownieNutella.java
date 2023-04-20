public class BrownieNutella extends Brownie{
    // construtor
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    // metodos
    public void adicionaNutella(){      // adiciona nutella no brownie

    }

    @Override
    public void mostraInfo() {
        System.out.println("INFORMAÇÕES DO BROWNIE DE NUTELLA: ");
        super.mostraInfo();
        System.out.println("--------------------------------------");
    }

    @Override
    public void addCarrinhoDeCompras() {
        super.addCarrinhoDeCompras();
    }

    @Override
    public void calculaValorTotalCompra() {
        super.calculaValorTotalCompra();
    }
}
