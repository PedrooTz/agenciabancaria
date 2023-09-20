package br.senai.sp.jandira.model;

public class Conta {

    boolean validaSaldo;

    private int numeroConta = 1234;

    private double saldo = 9652;

    private String agencia = "000-34-XX";


    public void realizarDeposito(Double valor) {
        this.saldo += valor;
        System.out.println("O saldo da sua conta é: " + this.saldo);

    }

    public void realizarSaque(Double valor) {

        if (validaSaldo) {
            this.saldo += valor;
            System.out.println("O saldo da conta é: " + this.saldo);
        } else {
            System.out.println("Você não tem saldo!");
        }


    }


    public void consultarSaldo() {
        System.out.println("Seu saldo é " + this.saldo);
    }

    public void avaliaSaque(double valor) {

        if (valor > this.saldo) {
            validaSaldo = false;
        } else {
            validaSaldo = true;
        }
    }
}

