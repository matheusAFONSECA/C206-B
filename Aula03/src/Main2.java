public class Main2 {

    public static void main(String[] args) {

        // instanciando o objeto zumbi
        Zumbi2 zumbi = new Zumbi2();

        // definindo o nome do zumbi e a vida
        zumbi.nome = "Zumbi Matheus";
        zumbi.vida = 10;

        System.out.println("Nome do zumbi: " + zumbi.nome);
        System.out.println("Nome do vida: " + zumbi.vida);

        // chamando um metodo da classe Zumbi2
        zumbi.mostraInfo();
    }

}
