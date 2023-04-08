// Importando as classes dos pacotes
import br.inatel.cdg.jogador.Jogador;
import br.inatel.cdg.Sistema.Conversor;

public class Main {
    public static void main(String[] args) {
        // código proposto em um exercicio para recriarmos a lógica do jogo
        // Arkanoid usando pacotes, construtores e modificadores de acesso

        // atributos
        Jogador j1 = new Jogador("Matheus");
        Conversor moedas = new Conversor();

        // definindo a quantidade de blocos
        j1.blocos = 5;
        j1.blocosDestruidos = 0;

        // criando 7 blocos
        j1.aumentaBlocos();
        j1.aumentaBlocos();
        j1.aumentaBlocos();
        j1.aumentaBlocos();
        j1.aumentaBlocos();
        j1.aumentaBlocos();
        j1.aumentaBlocos();

        // destruindo 5 blocos
        j1.destruirBlocos();
        j1.destruirBlocos();
        j1.destruirBlocos();
        j1.destruirBlocos();
        j1.destruirBlocos();

        // mostrando as informações do jogador
        j1.mostraInfo();

        // mostrando a pontuação e moedas do jogador
        moedas.mostraPontuacao(j1.pontuacao);
    }
}