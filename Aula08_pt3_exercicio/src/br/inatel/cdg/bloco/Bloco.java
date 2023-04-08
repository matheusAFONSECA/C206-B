package br.inatel.cdg.bloco;

public class Bloco {
    // Código que simula a lógica de um bloco no jogo Arkanoid
    int blocos;                 // blocos que existem no momento
    int blocosDestruidos;       // blocos destruidos

    // metodos
    public void destruirBlocos(){   // destroi os blocos
        blocosDestruidos++;     // incrementa a quantidade de blocos destruidos
        blocos --;              // decrementa a quantidade de blocos no jogo
    }

    public void aumentaBlocos(){    // aumenta a quantidade de blocos no jogo
        blocos++;               // incrementa a qauntidade de blocos
    }

    public void mostraInfoDestruidos(){ // mostra a quantidade de blocos destruidos
        System.out.println("Blocos destruidos: " + blocosDestruidos);
    }

    public void mostraInfoRestantes(){
        System.out.println("Blocos restantes: " + blocos);
    }
}
