import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        List<Desafio> listaDesafio = new ArrayList<>();

        // instanciando dois objetos de cada classe filha
        Filho f1 = new Filho("Davi", 223);
        Filho f2 = new Filho("Vivi", 1944);
        Abelha a = new Abelha("Bee", 19);
        Abelha a2 = new Abelha("Gadbem", 20);
        Toyota t = new Toyota("Corrola", 202020);
        Toyota t2 = new Toyota("Cross", 212121);

        // adicionando os objetos na lista de Array
        listaDesafio.add(a);
        listaDesafio.add(a2);
        listaDesafio.add(t);
        listaDesafio.add(t2);
        listaDesafio.add(f1);
        listaDesafio.add(f2);

        // ordenando de ordem descrescente pelo numero de cada classe
        Collections.sort(listaDesafio, Collections.reverseOrder());
        System.out.println("Antes da ordenação: ");
        for(Desafio desafio1 : listaDesafio){
            System.out.println("\t" + desafio1.nome);
            System.out.println("\t" + desafio1.numero);
        }
    }
}