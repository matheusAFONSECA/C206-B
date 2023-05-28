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
            int op;                                     // opção que o usuário vai escolher no menu
            int op1;                                    // opção que o usuário vai escolher de ação com a rede social
            while(flag){
                System.out.println("1 - compartilhar um post");
                System.out.println("2 - postar uma foto");
                System.out.println("3 - postar um comentário");
                System.out.println("4 - postar um video");
                System.out.println("5 - sair do menu");
                op = in.nextInt();

                switch (op){
                    case 1:
                        System.out.println("Qual das redes sociais voce deseja usar para compartilhar: ");
                        System.out.println("1 - " + usuario.redeSociaisUsuario.get(0));
                        System.out.println("2 - " + usuario.redeSociaisUsuario.get(1));
                        op1 = in.nextInt();

                        switch (op1){
                            case 1:
                                facebook.compartilhar();
                                break;
                            case 2:
                                twitter.compartilhar();
                                break;
                        }

                        break;
                    case 2:
                        System.out.println("Qual das redes sociais voce deseja usar para postar uma foto: ");
                        System.out.println("1 - " + usuario.redeSociaisUsuario.get(0));
                        System.out.println("2 - " + usuario.redeSociaisUsuario.get(1));
                        op1 = in.nextInt();

                        switch (op1){
                            case 1:
                                facebook.postarFoto();
                                break;
                            case 2:
                                twitter.postarFoto();
                                break;
                        }

                        break;
                    case 3:
                        System.out.println("Qual das redes sociais voce deseja usar para postar um comentario: ");
                        System.out.println("1 - " + usuario.redeSociaisUsuario.get(0));
                        System.out.println("2 - " + usuario.redeSociaisUsuario.get(1));
                        op1 = in.nextInt();

                        switch (op1){
                            case 1:
                                facebook.postarComentario();
                                break;
                            case 2:
                                twitter.postarComentario();
                                break;
                        }

                        break;

                    case 4:
                        System.out.println("Qual das redes sociais voce deseja usar para postar um video: ");
                        System.out.println("1 - " + usuario.redeSociaisUsuario.get(0));
                        System.out.println("2 - " + usuario.redeSociaisUsuario.get(1));
                        op1 = in.nextInt();

                        switch (op1){
                            case 1:
                                facebook.postarVideo();
                                break;
                            case 2:
                                twitter.postarVideo();
                                break;
                        }

                        break;

                    case 5:
                        System.out.println("Obrigado por utilizar o sistema!!!");
                        flag = false;
                        break;
                }

            }
        } catch (Exception e) {
            System.out.println("O erro foi: " + e);
        }

    }
}