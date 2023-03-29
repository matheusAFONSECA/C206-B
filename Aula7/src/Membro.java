public class Membro {
    // a classe Membro tera uma relação de agregação com a classe Banda
    // atributos
    String nome;    // nome do membro da banda
    String funcao;  // função do membro na banda

    // construtor
    public Membro(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }
}
