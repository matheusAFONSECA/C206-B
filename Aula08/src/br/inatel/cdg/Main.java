package br.inatel.cdg;

/*
-> Só podemos importar somente uma classe Matematica, caso queiremos usar a outra classe
Matematica, teremos que usar o full qualifity name, ou seja, o pacote inteiro!!!!
*/
import  br.inatel.cdg.matematica.Matematica;

public class Main {

    // as formas de instanciar a seguir são irrelevantes
    // instanciando uma variável do tipo Matematica que esta no pacote br.inatel.cdg.matematica
    br.inatel.cdg.matematica.Matematica ma = new br.inatel.cdg.matematica.Matematica();
    // instanciando uma variável do tipo Matematica que esta no pacote br.inatel.cdg.outramatemarica
    br.inatel.cdg.outramatemarica.Matematica ma2 = new br.inatel.cdg.outramatemarica.Matematica();

    // Maneira correta de instanciar uma var usando o import
    Matematica ma1 = new Matematica();
    public static void main(String[] args) {
        // Aula sobre a criação de pacotes e as boas práticas ao se criar pacotes
        // pacote são pastas criadas no projeto
        
    }
}
