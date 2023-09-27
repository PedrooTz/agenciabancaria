package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Conta referenciaConta = new Conta();
    Cliente referenciaCliente = new Cliente();

    public void executarMenu() {

        boolean continuar = true;

        do {

            System.out.println("/./././. Menu /./././.");
            System.out.println("1 Cadastrar Cliente");
            System.out.println("2 Gerar conta");
            System.out.println("3 Consultar saldo");
            System.out.println("4 Realizar Depósito");
            System.out.println("5 Realizar Saque");
            System.out.println("6 Transfêrencia");
            System.out.println("7  Sair   ");
            System.out.println("././././././././");

            int optionCLient = scanner.nextInt();

            scanner.nextLine();

            switch (optionCLient) {

                case 1:
                    Cliente cliente = new Cliente();
                    cliente.cadastrarCliente();
                    referenciaCliente.adicionarCliente(cliente);
                    break;

                case 2:
                    System.out.println("Informe o CPF do Titular:");
                    long cpfPesquisados = scanner.nextLong();
                    scanner.nextLine();

                    Cliente clienteConta = referenciaCliente.pesqusisarCliente(cpfPesquisados);
                    if (clienteConta != null){
                        Conta conta = new Conta();
                        conta.gerarConta(clienteConta);
                        referenciaConta.adicionarContaList(conta);
                        System.out.println("Conta criada com sucesso!");
                    } else {
                        System.out.println("Usuário não cadastrado...");
                    }

                    break;

                case 3:
                    System.out.println("Informe o CPF do Titular:");
                    long cpfConsulta = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaConsulta = referenciaConta.pesquisarConta(cpfConsulta);

                    if (contaConsulta != null){
                        double saldoConta = contaConsulta.getSaldo();
                        System.out.println("O valor disponível é " + saldoConta);
                    }else {
                        System.out.println("O usuário informado não possui uma conta.");
                    }


                    break;

                case 4:
                    System.out.println("Informe o CPF para depósito:");
                    long cpfDeposito = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaDeposito = referenciaConta.pesquisarConta(cpfDeposito);

                    if (contaDeposito != null){
                        System.out.println("Informe o valor para depósito: ");
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine();
                        contaDeposito.realizarDeposito(valorDeposito);

                    }else {
                        System.out.println("O usuário informado não possui uma conta.");
                    }




                    break;

                case 5:
                    System.out.println("Informe o CPF para depósito:");
                    long cpfSaque = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaSaque = referenciaConta.pesquisarConta(cpfSaque);

                    if (contaSaque != null){
                        System.out.println("Informe o valor para saque: ");
                        double valorSaque = scanner.nextDouble();
                        scanner.nextLine();

                        contaSaque.avaliaSaque(valorSaque);
                        contaSaque.realizarSaque(valorSaque);

                    }else {
                        System.out.println("O usuário informado não possui uma conta.");
                    }



                    break;

                case 6:
                    System.out.println("Informe o CPF do titular:");
                    long cpfTransferencia = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("Insira o valor a ser transferido:");







                case 7:
                    continuar = false;
                    break;

            }
        } while (continuar);
    }
}
