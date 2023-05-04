public class Filho extends Desafio{
    public Filho(String nome, int numero) {
        super(nome, numero);
    }

    @Override
    public int compareTo(Desafio o) {
        return Integer.compare(numero, o.numero);
    }
}
