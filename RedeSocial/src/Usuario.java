import java.util.ArrayList;

public class Usuario {
    // Atributos
    private String nome;        // nome do Usuario da Rede Social
    private String email;       // email do Usuario da Rede Social

    // Array de Redes Sociais
    ArrayList<RedeSocial> redeSociaisUsuario = new ArrayList<>();

    // construtor
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // metodos
    public void Usuario(RedeSocial[] redeSociais){      // adiciona as Redes Sociais do Usuario
        // Iterando sobre o array de redes sociais
        for (RedeSocial s: redeSociais) {
            redeSociaisUsuario.add(s);
        }
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
