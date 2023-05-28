import java.util.ArrayList;

public class Usuario {
    // Atributos
    private String nome;        // nome do Usuario da Rede Social
    private String email;       // email do Usuario da Rede Social

    // Array de Redes Sociais
    ArrayList<RedeSocial> redeSociais = new ArrayList<>();

    // construtor
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // metodos
    public void Usuario(RedeSocial[] redeSociais){      // adiciona as Redes Sociais do Usuario

    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
