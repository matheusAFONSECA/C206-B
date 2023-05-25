public abstract class RedeSocial {
    // Atributos
    protected String senha;         // senha da Rede Social
    protected int numAmigos;        // numeros de amigos da Rede Social

    // construtor
    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    // metodos
    public abstract void postarFoto();          // posta uma foto na Rede Social

    public abstract void postarVideo();         // posta um video na Rede Social

    public abstract void postarComentario();    // posta um Comentario na Rede Social

    public void cutirPublicacao(){              // curti uma publicação na Rede Social
        System.out.println("Publicação curtido com sucesso!!");
    }

    //getters e setters
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumAmigos() {
        return numAmigos;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }
}
