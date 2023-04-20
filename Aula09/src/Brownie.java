// -> Classe pai que representa um brownie genérico e depois vamos adcionar individualidade
// nas classes herdeiras (filhas)
public class Brownie {
    // atributos
    protected String nome;      // nome do tipo de brownie
    protected double preco;     // preco do brownie
    protected String sabor;     // sabor que o brownie tem
    double soma = 0;            // var aux
    int cafe = 0;
    int nutella = 0;
    int doce = 0;

    // construtor
    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    // metodos
    public void addCarrinhoDeCompras(){     // adiciona um Brownie no carrinho de compra
        if (getNome().equals("CAFE")){
            cafe++;
        } else if (getNome().equals("DOCE")){
            doce++;
        } else if(getNome().equals("NUTELLA")){
            nutella++;
        }

    }

    public void calculaValorTotalCompra(){  // calcula o valor da compra
        soma = getPreco() + soma;
    }

    public void mostraInfo(){               // mostra as informações dos brownies
        System.out.println("\tNOME:" + getNome());
        System.out.println("\tPREÇO: " + getPreco());
        System.out.println("\tSABOR: " + getSabor());
    }

    // getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
