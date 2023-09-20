package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Conta conta = new Conta();
    Cliente cliente = new Cliente();

    public void executarMenu() {

        boolean continuar = true;

        do {

            System.out.println("/./././. Menu /./././.");
            System.out.println("1 Cadastrar Cliente");
            System.out.println("2 Consultar Saldo");
            System.out.println("3 Realizar Depósito");
            System.out.println("4 Realizar Saque");
            System.out.println("Sair");
            System.out.println("././././././././");

            int optionCLient = scanner.nextInt();

            scanner.nextLine();

            switch (optionCLient) {

                case 1:
                    cliente.cadastrarCliente();
                    break;

                case 2:
                    conta.consultarSaldo();
                    break;

                case 3:
                    System.out.print("Informe o valor para depósito");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();
                    conta.realizarDeposito(valorDeposito);
                    break;

                case 4:
                    System.out.print("Informe o valor para saque");
                    double valorSaque = scanner.nextDouble();
                    conta.realizarSaque(valorSaque);
                    break;

                case 5:
                    continuar = false;
                    break;

            }
        } while (continuar);
    }
}
