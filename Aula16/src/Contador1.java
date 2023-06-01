public class Contador1 implements Runnable{
    // Runnable -> interface que possui o método run
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            System.out.println("Valor do cont: " + i + " Contador 1");
        }
    }
}
