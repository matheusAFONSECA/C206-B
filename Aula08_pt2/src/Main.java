// importando os pacotes e as classes contidas para a instanciação
import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    // código que simula a parte de lógica um jogo onde uma nave destroi os asteiroides
    // nesse código devemos usar os conceitos aprendidos de pacotes e controle para fazer
    // o exercício proposto

    public static void main(String[] args) {
        // instanciando os objetos
        Nave n1;        // Nave com tiro explosivo
        Nave n2;        // Nave com tiro normal
        Asteroide a1;   // Asteroide pequeno
        Asteroide a2;   // Asteroide grande

        // definido os valores dos atributos dos objetos
        n1 = new Nave("Pedrolarian", 500, "EXPLOSIVO");
        n2 = new Nave("Vima", 250, "NORMAL");

        a1 = new Asteroide("DAVI", "PEQUENO");
        a2 = new Asteroide("ZE", "GRANDE");

        // usando metodos e vendo os resultados
        n1.atirar(a1);
        n1.atirar(a2);

        n2.atirar(a1);
        n2.atirar(a2);

    }
}