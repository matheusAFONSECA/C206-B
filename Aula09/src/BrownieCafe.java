public class BrownieCafe extends Brownie{
    // construtor
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    // metodos
    public void adicionaCafe(){         // adiciona cafe no Brownie

    }

    @Override
    public void mostraInfo() {
        System.out.println("INFORMAÇÕES DO BROWNIE DE CAFÉ: ");
        super.mostraInfo();
        System.out.println("-------------------------------------");
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
