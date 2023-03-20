public class Empresario {
    // a classe Empresario tera uma relação de agregação com a classe Banda
    // atributos
    String nome;    // nome do empresario
    long cnpj;      // cnpj do empresario

    // construtor
    public Empresario(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
}
