import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // criando um Usuário
        Usuario usuario = new Usuario("Matheus", "Henrique@email.com");

        // criando duas redes sociais
        Facebook facebook = new Facebook("141414", 1000);
        Twitter twitter = new Twitter("151515", 500);

        // Array de Redes Sociais
        RedeSocial[] redeSociais = new RedeSocial[20];

        // adicionando as redes sociais ao usuario
        redeSociais[0] = facebook;
        redeSociais[1] = twitter;
        usuario.Usuario(redeSociais);

        // fazendo o tratamento de erros e usando uma função de cada rede social
        try{
            System.out.println("Olaaa " + usuario.getNome() + ", seja bem vindo!");
            System.out.println("Qual ação você gostaria de realizar nas suas redes sociais?");

            Scanner in = new Scanner(System.in);        // Scanner para entrada de dados
            boolean flag = true;                        // flag de controle do menu
            int op;                                     // opção que o usuário vai escolher
            while(flag){
                System.out.println("1 - compartilhar um post");
                System.out.println("2 - postar uma foto");
                System.out.println("3 - postar um comentário");
                op = in.nextInt();

                switch (op){
                    case 1:
                        System.out.println("Qual das redes sociais voce deseja usar: ");
                        System.out.println("1 - " + );
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }

            }
        } catch (Exception e) {
            System.out.println("O erro foi: " + e);
        }

    }
}