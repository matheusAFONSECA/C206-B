package org.example;

// classe para trator o erro de Saldo insuficiente na conta
public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String message) {
        super(message);
    }

}
