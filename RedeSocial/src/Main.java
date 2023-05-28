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
        boolean flag2 = true;       // controle do try -> catch
        while(flag2){
            try{
                flag2 = false;
                System.out.println("Olaaa " + usuario.getNome() + ", seja bem vindo!");
                System.out.println("Qual ação você gostaria de realizar nas suas redes sociais?");

                Scanner in = new Scanner(System.in);        // Scanner para entrada de dados
                boolean flag = true;                        // flag de controle do menu
                int op;                                     // opção que o usuário vai escolher no menu
                int op1;                                    // opção que o usuário vai escolher de ação com a rede social
                int controle1 = 0;                              // var de controle da opção 1
                int controle2 = 0;                              // var de controle da opção 2
                int controle3 = 0;                              // var de controle da opção 3
                int controle4 = 0;                              // var de controle da opção 4
                while(flag){
                    System.out.println("1 - compartilhar um post");
                    System.out.println("2 - postar uma foto");
                    System.out.println("3 - postar um comentário");
                    System.out.println("4 - postar um video");
                    System.out.println("5 - sair do menu");
                    op = in.nextInt();

                    switch (op){
                        case 1:     // caso o usuário queira compartilhar
                            if(controle1 == 0){
                                System.out.println("Qual das redes sociais voce deseja usar para compartilhar: ");
                                System.out.println("1 - " + usuario.redeSociaisUsuario.get(0));
                                System.out.println("2 - " + usuario.redeSociaisUsuario.get(1));
                                op1 = in.nextInt();

                                switch (op1){
                                    case 1:
                                        facebook.compartilhar();
                                        controle1++;
                                        break;
                                    case 2:
                                        twitter.compartilhar();
                                        controle1--;
                                        break;
                                }
                            } else {
                                if (controle1 == 1){
                                    System.out.println(usuario.getNome() + " você já compartilhou o post no Facebook");
                                }
                                if (controle1 == (-1)){
                                    System.out.println(usuario.getNome() + " você já compartilhou o post no Twitter");
                                }
                            }
                            break;

                        case 2:     // caso o usuário queira postar uma foto
                            if(controle2 == 0){
                                System.out.println("Qual das redes sociais voce deseja usar para postar uma foto: ");
                                System.out.println("1 - " + usuario.redeSociaisUsuario.get(0));
                                System.out.println("2 - " + usuario.redeSociaisUsuario.get(1));
                                op1 = in.nextInt();

                                switch (op1){
                                    case 1:
                                        facebook.postarFoto();
                                        controle2++;
                                        break;
                                    case 2:
                                        twitter.postarFoto();
                                        controle2--;
                                        break;
                                }
                            } else {
                                if (controle2 == 1){
                                    System.out.println(usuario.getNome() + " você já postou a foto no Facebook");
                                }
                                if (controle2 == (-1)){
                                    System.out.println(usuario.getNome() + " você já postou a foto no Twitter");
                                }
                            }
                            break;

                        case 3:     // caso o usuário queira postar um comentário
                            if(controle3 == 0){
                                System.out.println("Qual das redes sociais voce deseja usar para postar um comentario: ");
                                System.out.println("1 - " + usuario.redeSociaisUsuario.get(0));
                                System.out.println("2 - " + usuario.redeSociaisUsuario.get(1));
                                op1 = in.nextInt();

                                switch (op1){
                                    case 1:
                                        facebook.postarComentario();
                                        controle3++;
                                        break;
                                    case 2:
                                        twitter.postarComentario();
                                        controle3--;
                                        break;
                                }
                            } else {
                                if (controle3 == 1){
                                    System.out.println(usuario.getNome() + " você já realizou um comentário no Facebook");
                                }
                                if (controle3 == (-1)){
                                    System.out.println(usuario.getNome() + " você já realizou um comentário no Twitter");
                                }
                            }
                            break;

                        case 4:     // caso o usuário queira postar um video
                            if(controle4 == 0){
                                System.out.println("Qual das redes sociais voce deseja usar para postar um video: ");
                                System.out.println("1 - " + usuario.redeSociaisUsuario.get(0));
                                System.out.println("2 - " + usuario.redeSociaisUsuario.get(1));
                                op1 = in.nextInt();

                                switch (op1){
                                    case 1:
                                        facebook.postarVideo();
                                        controle4++;
                                        break;
                                    case 2:
                                        twitter.postarVideo();
                                        controle4--;
                                        break;
                                }
                            } else {
                                if (controle4 == 1){
                                    System.out.println(usuario.getNome() + " você já postou o vídeo no Facebook");
                                }
                                if (controle4 == (-1)){
                                    System.out.println(usuario.getNome() + " você já postou o vídeo no Twitter");
                                }
                            }
                            break;

                        case 5:
                            System.out.println("Obrigado por utilizar o sistema!!!");
                            flag = false;
                            break;

                        default:
                            System.out.println("Opção inválida no menu...");
                    }

                }
            } catch (Exception e) {
                System.out.println("O erro foi: " + e);
                System.out.println("Tente novamente...");
                flag2 = true;
            }
        }

    }
}