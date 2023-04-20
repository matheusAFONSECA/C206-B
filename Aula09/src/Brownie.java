// -> Classe pai que representa um brownie genérico e depois vamos adcionar individualidade
// nas classes herdeiras (filhas)
public class Brownie {
    // atributos
    protected String nome;      // nome do tipo de brownie
    protected double preco;     // preco do brownie
    protected String sabor;     // sabor que o brownie tem
    static double soma;            // var aux
    static int cafe;
    static int nutella;
    static int doce;

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

        System.out.println("BROWNIE ADICIONADO COM SUCESSO");

        System.out.println("BROWNIES NO CARRINHO: ");
        if (cafe != 0){
            System.out.println("\tCAFE: " + cafe);
        }
        if (nutella != 0){
            System.out.println("\tNUTELLA: " + nutella);
        }
        if (doce != 0){
            System.out.println("\tDOCE DE LEITE: " + doce);
        }

        System.out.println("----------------------------------");
    }

    public void calculaValorTotalCompra(){  // calcula o valor da compra
        soma = getPreco() + soma;
        System.out.println("VALOR DA COMPRA: " + soma);

        System.out.println("----------------------------------");
    }

    public void mostraInfo(){               // mostra as informações dos brownies
        System.out.println("\tNOME: " + getNome());
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
