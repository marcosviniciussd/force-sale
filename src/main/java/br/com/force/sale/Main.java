package br.com.force.sale;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        do {
            System.out.println("\n\n|+------------------------------------+|");
            System.out.println("|           SISTEMA FORCE SALE         |");
            System.out.println("|+------------------------------------+|");
            System.out.println("1 - PESSOAS");
            System.out.println("2 - PRODUTOS");
            System.out.println("3 - CONTAS A PAGAR");
            System.out.println("4 - CONTAS A RECEBER");
            System.out.println("5 - VENDAS\n");
            System.out.println("6 - SAIR");
            System.out.print("\nSELECIONE UMA OPÇÂO: ");
            try {
                Scanner menu = new Scanner(System.in);
                int input = menu.nextInt();

                switch (input) {
                    case 1:
                        System.out.print("\nOpção Cadastro de Pessoas\n");
                        MenuPessoa menuPessoa = new MenuPessoa();
                        menuPessoa.menuPessoas();
                        break;
                    case 2:
                        System.out.print("\nOpção Cadastro de Produtos\n");
                        break;
                    case 3:
                        System.out.print("\nOpção Operação de Contas a Pagar\n");
                        break;
                    case 4:
                        System.out.print("\nOpção Operação de Contas a Receber\n");
                        break;
                    case 5:
                        System.out.print("\nOpção Operação de Venda\n");
                        break;
                    case 6:
                        System.out.print("\nAté logo!");
                        //menu.close();
                        break;
                    default:
                        System.out.print("\nOpção Inválida!");
                        break;
                }
            }
            catch (NumberFormatException e) { }
        }
        while(true);
    }
}