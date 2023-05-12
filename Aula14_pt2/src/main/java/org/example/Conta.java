package org.example;

import org.example.SaldoInsuficienteException;

public class Conta {
    // atributos
    private float saldo;            // saldo da conta
    private float limite;           // limite da conta
    private Cliente[] clientes;     // clientes que fazem parte da conta


    // construtor
    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
        this.clientes = new Cliente[4];
    }

    // metodos
    public void sacar(float quantia) throws SaldoInsuficienteException {        // sacar dinheito da conta

        if(quantia <= saldo) {
            this.saldo -= quantia;
        } else {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }

    }

    public void addCliente(Cliente cliente) {       // adiciona cliente na conta
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] == null) {
                clientes[i] = cliente;
                break;
            }
        }
    }

    public void mostraInfo() {      // mostra informações da conta conjunta
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);

        for (Cliente cliente : clientes) {
            try {
                System.out.println("Nome do cliente: " + cliente.getNome());
                System.out.println("CPF do cliente: " + cliente.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Nao existe cliente nessa posicao");
            }
        }
    }
}
