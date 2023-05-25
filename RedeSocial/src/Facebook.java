public class Facebook extends RedeSocial implements Compartilhamento, VideoConferencia{
    // construtor
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // metodos
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook!!!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook!!!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Facebook!!!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no Facebook!!!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez um Streaming no Facebook!!!");
    }
}
