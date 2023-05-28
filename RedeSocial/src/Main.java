public class Main {
    public static void main(String[] args) {

        // criando um Usuário
        Usuario usuario = new Usuario("Matheus", "Henrique@email.com");

        // criando duas redes sociais
        Facebook facebook = new Facebook("141414", 1000);
        Twitter twitter = new Twitter("151515", 500);

        // adicionando as redes sociais ao usuario
        usuario.redeSociais.add(facebook);
        usuario.redeSociais.add(twitter);

        // fazendo o tratamento de erros e usando uma função de cada rede social
        
        
    }
}