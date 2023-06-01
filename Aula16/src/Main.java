public class Main {
    public static void main(String[] args) {

        // instanciando um objeto de contador 1
        Contador1 contador1 = new Contador1();
        Thread th1 = new Thread(contador1);         // instanciando a thread
        th1.start();                                // inicia a thread

        // instanciando um objeto de contador 2
        Contador2 contador2 = new Contador2();
        Thread th2 = new Thread(contador2);         // instanciando a thread
        th2.start();                                // inicia a thread

        // instanciando um objeto de contador 3
        Contador3 contador3 = new Contador3();
        Thread th3 = new Thread(contador3);         // instanciando a thread
        th3.start();                                // inicia a thread
    }
}