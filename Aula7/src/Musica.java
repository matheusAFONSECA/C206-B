public class Musica {
    // a classe Musica tera uma relação de agregação com a classe Banda
    // atributos
    String nome;    // nome da música
    double duração; // tempo de reprodução da musica

    // construtor
    public Musica(String nome, double duração) {
        this.nome = nome;
        this.duração = duração;
    }
}
