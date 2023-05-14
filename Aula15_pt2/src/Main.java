// importação de bibliotecas usadas para usarmos o Java NIO
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // frase que vamos codificar
        String frase = "Bora participar da SeComp";
        int deslocamento = 5;

        //arquivo que vamos salvar o texto criptografado
        String nomeArquivo = "textoCriptografado.txt";

        //PARTE PARA ESCREVER NO ARQUIVO!

        // String aux para criptografia
        StringBuilder textoCriptografado = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            textoCriptografado.append((char)(frase.charAt(i) + deslocamento));
        }

        // pega o nome do arquivo
        Path arquivo = Paths.get(nomeArquivo);

        try {
            // escreve a string no arquivo
            Files.writeString(arquivo, textoCriptografado);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        // mostra a string criptografada
        System.out.println(textoCriptografado.toString());

        // Leitura do arquivo
        StringBuilder textDescriptografado = new StringBuilder();
        String fraseSalvoArquivo = null;

        try {
            // frase que foi salva no arquivo
            fraseSalvoArquivo = Files.readString(arquivo);
        } catch (IOException e1) {
            e1.printStackTrace();
        }


        for (int i = 0; i < fraseSalvoArquivo.length(); i++) {
            textDescriptografado.
                    append((char)(fraseSalvoArquivo.charAt(i) - deslocamento));
        }

        // mostra no terminal a frase salva no arquivo
        System.out.println(fraseSalvoArquivo);
        System.out.println(textDescriptografado.toString());

    }

}