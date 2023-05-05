import java.util.*;

public class Main {
    public static void main(String[] args) {
        // var aux
        int QTD = 400000;

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

        // buscando valores na ArrayList
        for (int i = 0; i < QTD; i++){
            array.contains(i);
        }

        // pegando o tempo final para buscar elementos na ArrayList
        TF = System.currentTimeMillis();

        // saindo o tempo para buscar elmentos na ArrayList
        TT = TF - TI;
        System.out.println("TEMPO PARA BUSCAR ELEMENTOS NA ARRAYLIST: " + TT + "ms");

        // criando um HashSet
        Set<Integer> hashSet = new HashSet<Integer>();

        // pegando o tempo inicial para adicionar elementos no HashSet
        TI = System.currentTimeMillis();

        // adicionando valores no HashSet
        for (int i = 0; i < QTD; i++){
            hashSet.add(i);
        }

        // pegando o tempo final para adicionar elementos no HashSet
        TF = System.currentTimeMillis();

        // saindo o tempo para adicionar elmentos na HashSet
        TT = TF - TI;
        System.out.println("TEMPO PARA ADICIONAR ELEMENTOS NO HASHSET: " + TT + "ms");

        // pegando o tempo inicial para buscar elementos no HashSet
        TI = System.currentTimeMillis();

        // buscando valores no HashSet
        for (int i = 0; i < QTD; i++){
            hashSet.contains(i);
        }

        // pegando o tempo final para buscar elementos no HashSet
        TF = System.currentTimeMillis();

        // saindo o tempo para buscar elmentos na HashSet
        TT = TF - TI;
        System.out.println("TEMPO PARA BUSCAR ELEMENTOS NO HASHSET: " + TT + "ms");

        // criando um HashMap
        Map<Integer, Integer> hashMap = new HashMap<>();

        // pegando o tempo inicial para adicionar elementos no HashMap
        TI = System.currentTimeMillis();

        // adicionando valores no HashMap
        for (int i = 0; i < QTD; i++){
            hashMap.put(i, i);
        }

        // pegando o tempo final para adicionar elementos no HashMap
        TF = System.currentTimeMillis();

        // saindo o tempo para adicionar elmentos na HashMap
        TT = TF - TI;
        System.out.println("TEMPO PARA ADICIONAR ELEMENTOS NO HASHMAP: " + TT + "ms");

        // pegando o tempo inicial para buscar elementos no HashMap
        TI = System.currentTimeMillis();

        // buscando valores no HashMap
        for (int i = 0; i < QTD; i++){
            hashMap.containsKey(i);
        }

        // pegando o tempo final para buscar elementos no HashMap
        TF = System.currentTimeMillis();

        // saindo o tempo para buscar elmentos na HashMap
        TT = TF - TI;
        System.out.println("TEMPO PARA BUSCAR ELEMENTOS NO HASHMAP: " + TT + "ms");

    }
}