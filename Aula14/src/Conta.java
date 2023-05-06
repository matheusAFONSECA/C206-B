import java.util.HashSet;
import java.util.Set;

public class Conta {        // classe de uma conta conjunto de um grupo de clientes de um banco
    // atributos da conta
    private float saldo;        // saldo da conta
    private float limite;       // limite da conta
    private Set<Cliente> clientes = new HashSet<>();    // HashSet para adicionar os clientes da conta


    // construtor
    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    // metodos
    public void addCliente(Cliente cliente) {       // adiciona um cliente na conta
        clientes.add(cliente);  // adiciona um cliente no HashSet ->  clientes
    }

    public void mostraInfo() {      // mostra as informações dos clientes
        System.out.println("INFORMAÇÕES DA CONTA CONJUNTA: ");
        System.out.println("\tSaldo: " + saldo);
        System.out.println("\tLimite: " + limite);

        System.out.println("\tNOMES DOS CLIENTES DESSA CONTA CONJUNTA:");
        // Aqui tratam os dados dos clientes dessa conta conjunta
        for (Cliente cliente : clientes) {
            try {
                System.out.println("\t\tNome do cliente: " + cliente.getNome());
                System.out.println("\t\tCPF do cliente: " + cliente.getCpf());
            } catch (NullPointerException e) {      // caso o cliente seja null, roda essa parte e continua a compilação
                System.out.println("\t\tNao existe cliente nessa posicao");
            }
        }
    }
}
