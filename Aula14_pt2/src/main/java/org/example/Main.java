package org.example;

public class Main {
    public static void main(String[] args) {
        // instanciando dois clientes
        Cliente cliente1 = new Cliente("Tio", 4321);
        Cliente cliente2 = new Cliente("Tia", 1234);

        // instanciando uma conta
        Conta conta = new Conta(1500, 500);

        // adicionando clientes na conta
        conta.addCliente(cliente1);
        conta.addCliente(cliente2);

        // mostrando as informações dos clientes
        System.out.println("Mostra Info dos Clientes");
        System.out.println();
        conta.mostraInfo();
        System.out.println();

        // tentativa de sacar
        System.out.println("Tenta Sacar 1000");
        try {
            conta.sacar(1000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        // mostra as informações da conta após a tentativa de saque
        System.out.println();
        conta.mostraInfo();
        System.out.println();

        // tenta sacar novamente
        System.out.println("Tenta Sacar 1000");
        try {
            conta.sacar(1000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        // mostra as informações da conta depois da tentativa de saque
        System.out.println();
        conta.mostraInfo();
        System.out.println();

        System.out.println("Fim da Main");
    }
}