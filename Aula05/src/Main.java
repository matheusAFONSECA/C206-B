public class Main {
    // Aula de associação de objetos
    /*
    * Associação é a capacidade da linguagem conseguir corelacionar as classes entre si, ou seja,
    é sobre o relacionamento entre objetos
    * Existem dois tipos de associação: Composição e Agregação
    * AGREGAÇÃO: quer dizer que um objeto parte pode exister sem o obejto inteiro
    * COMPOSIÇÃO: a existência do objeto parte não faz sentido existir sem o objeto inteiro
    * Construtor é um modo de fazermos uma classe se relacionar com a outra classe em uma associação
    */
    public static void main(String[] args) {

        Personagem matheus = new Personagem();
        Arma faca = new Arma();

        matheus.nome = "Matheus";
        matheus.pontos = 100;
        faca.resistencia = 999;

        // aqui ocorre a agregação de dois objetos independentes -> agregação
        matheus.arma = faca;

        matheus.tomarDano();
        matheus.usaArma();

        faca.mostraInfoArma();

    }
}