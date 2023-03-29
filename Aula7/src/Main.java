public class Main {
    public static void main(String[] args) {
        // código que vai fazer instaciar uma banda e adicionar a ela seus instegrantes, empresario e
        // estilo musical

        // instanciando a banda
        Banda banda;
        banda = new Banda("KISS", "ROCK");

        // instanciando o empresario
        Empresario empresario;
        empresario = new Empresario("Pedrão", 1414655);
        banda.empresario = empresario;      // definindo o empresario da banda

        // considerando que existem 3 membros
        Membro membro1 = new Membro("ZÉ", "Cantor");
        Membro membro2 = new Membro("DAVI", "BATERISTA");
        Membro membro3 = new Membro("JOÃO", "GUITARRISTA");

        // Adicionando os membros na banda
        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);
        banda.addMembroNovo(membro3);

        // considerando 2 musicas
        Musica musica1 = new Musica("100", 100);
        Musica musica2 = new Musica("CHIRS", 20);

        // Adicionando as musicas na banda
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);

        // mostrando as informações da banda
        banda.mostraInfo();

    }
}