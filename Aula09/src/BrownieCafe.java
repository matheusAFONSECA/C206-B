public class BrownieCafe extends Brownie{
    // construtor
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    // metodos
    public void adicionaCafe(){         // adiciona cafe no Brownie
        System.out.println("ADICIONOU MAIS CAFE!!!!!");
        System.out.println("PRECO SUBIU R$ 3,00");
        setPreco(getPreco() + 3);
        System.out.println("------------------------------");
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
