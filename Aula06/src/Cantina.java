public class Cantina {
    // atributos
    String nome;    // nome da cantina
    // classe que vai ter a classe Salgado como agregação
    Salgado[] salgados = new Salgado[20];    // salgado que a cantina vai ter declarado como array

    // metodos
    void addSalgado(Salgado novoSalgado){  // adiciona um salgado à cantina

        for(int i = 0; i < salgados.length; i++){   // percorre a array de salgados
            if (salgados[i] == null){               // verifica se a posição na array esta vazia
                salgados[i] = novoSalgado;          // adiciona o salgado
                break;                              // para de passar pela array
            }
        }

    }

    void mostraInfo(){      // mostra a quantidade de salgados da cantina
        System.out.println("Nome dos salgados da Cantina: " + nome);
        for(int i = 0; i < salgados.length; i++){   // percorre a array de salgados
            if (salgados[i] != null){
                System.out.println((i+1) + ": " + salgados[i].nome);
            }
        }
    }
}
