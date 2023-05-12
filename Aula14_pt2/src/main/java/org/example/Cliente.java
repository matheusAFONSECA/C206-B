package org.example;

public class Cliente {
    // atributos
    private String nome;        // nome do cliente
    private long cpf;           // cpf do cliente

    // construtor
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
}
