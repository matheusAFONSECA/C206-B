public class Musica {
    // a classe Musica tera uma relação de agregação com a classe Banda
    // atributos
    String nome;    // nome da música
    double duracao; // tempo de reprodução da musica

    // construtor
    public Musica(String nome, double duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }
}
