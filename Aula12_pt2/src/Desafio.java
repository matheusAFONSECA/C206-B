public abstract class Desafio implements Comparable<Desafio>{
    // atributos
    String nome;        // nome do desafio
    int numero;         // numero do desafio

    // construtor
    public Desafio(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public int compareTo(Desafio o) {
        return Integer.compare(numero, o.numero);
    }

}
