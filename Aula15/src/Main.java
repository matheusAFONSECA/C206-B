// importação de bibliotecas necessárias para isar arquivos
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* A biblioteca IO nos permite trablhar com arquivos, porem ela possuia limitações e por isso
quando o Java passou por uma atualização foi-se feito uma repaginada nessa biblioteca
* Com a chegada da biblioteca NIO, que integrou as funções da IO, e trouxe maneiras mais eficientes
e completas de trabalharmos com arquivos
*/

public class Main {

    public static void main(String[] args) {
        // determinando o arquivo de texto -> .txt
        Path arquivo = Paths.get("professores_disciplina.txt");

        try {
            List<String> conteudo = Files.readAllLines(arquivo);
            Map<String,String> professores_disciplinas = new HashMap<>();

            // lendo os conteudos do arquivo .txt
            conteudo.forEach((linha) -> {
                String[] linhaQuebrada = linha.split("=");      // separando as informações do arquivo
                professores_disciplinas.put(linhaQuebrada[0],linhaQuebrada[1].strip());
            });

            // mostrando as informações que estavam no arquivo .txt
            professores_disciplinas.forEach((professor, disciplina) -> {
                System.out.println("Professor: " + professor);
                System.out.println("Disciplina: " + disciplina);
                System.out.println("-----------------------------------------");
            });

        } catch (IOException e) {       // trantando um erro relacionado com a biblioteca IO
            e.printStackTrace();
        }
    }

}