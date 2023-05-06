public class Main {
    public static void main(String[] args) {

        // criando três clientes
        Cliente cliente1 = new Cliente("Tio", 4321);
        Cliente cliente2 = new Cliente("Tia", 1234);
        Cliente cliente3 = null;        // esse cliente tem que ser null -> para tratarmos o erro na
                                        // classe conta(onde haverá o erro)

        // criando uma conta conjunto que terá os clientes
        Conta conta = new Conta(1500, 500);

        // adicionando os clientes na conta conjunta
        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        // mostrando as informações do cliente
        conta.mostraInfo();

        // colocamos esse Sout para vermos que o código vai compilar, mesmo que tenha
        // o erro de um cliente ser Null
        System.out.println("Fim da Main");

    }
}