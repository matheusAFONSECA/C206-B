public class Cliente {      // clientes de um banco que fazer parte de uma conta conjunta
    // atributos
    private String nome;        // nome do cliente
    private long cpf;           // cpf do cliente

    // construtor
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // getters
    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
}
