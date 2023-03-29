public class Banda {
    // classe principal do código
    // todas as classes que teraão relação com ela serão arrays aqui, exceto a classe Empresario
    String nome;      // nome da banda
    String genero;    // genero de música que a banda toca
    Membro[] membros = new Membro[20];    // membro da banda
    Musica[] musicas = new Musica[20];    // musica da banda
    Empresario empresario;      // empresario da banda

    // construtor
    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // metodos
    void mostraInfo(){      // mostra as informações da banda

        System.out.println("-> INFORMAÇÕES DA BANDA <-");
        System.out.println("Nome da banda: " + this.nome + "\tTipo de musica: " + this.genero);
        System.out.println("Empresário: " + empresario.nome + "\tCPNJ: " + empresario.cnpj);
        System.out.println("Membros: ");
        for(int i = 0; i < membros.length; i++){
            if (membros[i] != null){
                System.out.println("\tNome: " + membros[i].nome + "\tFuncão: " + membros[i].funcao);
            }
        }
        System.out.println("Musicas: ");
        for(int i = 0; i < musicas.length; i++){
            if (musicas[i] != null){
                System.out.println("\tNome: " + musicas[i].nome + "\tDuração: " + musicas[i].duracao);
            }
        }
    }

    public void addMusicaNova(Musica musica) {   // adiciona uma música nova no repertório da banda
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null) {
                musicas[i] = musica;
                break;
            }
        }
    }

    public void addMembroNovo(Membro membro){   // adiciona um novo membro na banda
        for(int i = 0; i < membros.length; i++){
            if (membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }


}
