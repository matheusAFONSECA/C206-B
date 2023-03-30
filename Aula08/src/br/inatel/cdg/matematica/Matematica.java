package br.inatel.cdg.matematica;   // indica o pacote onde a classe Matematica esta
public class Matematica {
    // var public qualquer outra classe pode acessar
    // var private é somente a propria classe que pode acessar
    private int saldo;

    // setter é um "metodo" que permite modificar uma variável private de uma classe
    // getter é um "metodo" que permite acessar o valor da variável
    // setters e getters
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
