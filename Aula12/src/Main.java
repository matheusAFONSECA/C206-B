import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // criando a ArrayList
        List<Double> listaDouble = new ArrayList<>();


        // adicionando 5 numeros aleatórios na lista
        for(int i = 0; i < 5; i++){
            listaDouble.add(new Random().nextDouble()*100);
        }

        // mostrando os elementos que foram adicionados no ArrayList
        System.out.println("Antes da ordenação: ");
        for(Double double1 : listaDouble){
            System.out.println("\t" + double1);
        }

        // ordenando o ArrayList de forma decrescente
        Collections.sort(listaDouble, Collections.reverseOrder());
        System.out.println("Depois da ordenação decrescente");
        for(Double double1 : listaDouble){
            System.out.println("\t" + double1);
        }

    }
}