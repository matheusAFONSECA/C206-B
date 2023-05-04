import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // var aux
        int QTD = 100000;

        // criando uma ArrayList
        List<Integer> array = new ArrayList<>();

        // pegando o tempo inicial para adicionar elementos na ArrayList
        long TI = System.currentTimeMillis();

        // adicionando valores na ArrayList
        for (int i = 0; i < QTD; i++){
            array.add(i);
        }

        // pegando o tempo final para adicionar elementos na ArrayList
        long TF = System.currentTimeMillis();

        // saindo o tempo para adicionar elmentos na ArrayList
        long TT = TF - TI;
        System.out.println("TEMPO PARA ADICIONAR ELEMENTOS NA ARRAYLIST: " + TT + "ms");

        // pegando o tempo inicial para adicionar elementos na ArrayList
        TI = System.currentTimeMillis();

        // adicionando valores na ArrayList
        for (int i = 0; i < QTD; i++){
            array.get(i);
        }

        // pegando o tempo final para adicionar elementos na ArrayList
        TF = System.currentTimeMillis();

        // saindo o tempo para adicionar elmentos na ArrayList
        TT = TF - TI;
        System.out.println("TEMPO PARA BUSCAR ELEMENTOS NA ARRAYLIST: " + TT + "ms");

        // criando uma ArrayList
        List<Integer> array = new ArrayList<>();

        // pegando o tempo inicial para adicionar elementos na ArrayList
        long TI = System.currentTimeMillis();

        // adicionando valores na ArrayList
        for (int i = 0; i < QTD; i++){
            array.add(i);
        }

        // pegando o tempo final para adicionar elementos na ArrayList
        long TF = System.currentTimeMillis();

        // saindo o tempo para adicionar elmentos na ArrayList
        long TT = TF - TI;
        System.out.println("TEMPO PARA ADICIONAR ELEMENTOS NA ARRAYLIST: " + TT + "ms");

    }
}