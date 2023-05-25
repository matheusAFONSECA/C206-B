public class Twitter extends RedeSocial implements Compartilhamento{
    // construtor
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // metodos
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no Twitter!!!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter!!!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Twitter!!!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Twitter!!!");
    }
}
