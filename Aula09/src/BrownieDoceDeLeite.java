public class BrownieDoceDeLeite extends Brownie{
    // construtor
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    // metodos
    public void adicionaDoceDeLeite(){      // adiciona doce de leite no Brownie
        System.out.println("ADICIONOU MAIS DOCE DE LEITE!!!!!");
        System.out.println("PRECO SUBIU R$ 1,00");
        setPreco(getPreco() + 1);
        System.out.println("------------------------------");
    }

    @Override
    public void mostraInfo() {
        System.out.println("INFORMAÇÕES DO BROWNIE DE DOCE DE LEITE: ");
        super.mostraInfo();
        System.out.println("-------------------------------------------");
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
