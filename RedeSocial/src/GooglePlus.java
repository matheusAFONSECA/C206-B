public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia{
    // construtor
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // metodos
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no GooglePlus!!!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!!!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no GooglePlus!!!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no GooglePlus!!!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez um Streaming no GooglePlus!!!");
    }
}
