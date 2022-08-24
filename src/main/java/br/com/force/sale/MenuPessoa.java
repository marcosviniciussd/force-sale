package br.com.force.sale;

import br.com.force.sale.pessoa.CadastraCliente;
import br.com.force.sale.pessoa.Cliente;

import java.util.Scanner;

public class MenuPessoa {

    public void menuPessoas(){
        Scanner menu = new Scanner (System.in);

        System.out.println("\n\n|+------------------------------+|");
        System.out.println("|          MENU PESSOAS          |");
        System.out.println("|+------------------------------+|");
        System.out.print("|+------------------------------+|\n");
        System.out.print("|  Opção 1 - Clientes            |\n");
        System.out.print("|  Opção 2 - Endereço            |\n");
        System.out.print("|  Opção 3 - Fornecedores        |\n");
        System.out.print("|  Opção 4 - Representantes      |\n");
        System.out.print("|  Opção 5 - Usuários            |\n");
        System.out.print("|  Opção 6 - Consultas           |\n");
        System.out.print("|                                |\n");
        System.out.print("|  Opção 7 - Sair                |\n");
        System.out.print("|+------------------------------+|\n");
        System.out.print("DIGITE UMA OPÇÂO: ");

        int opcao = menu.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("\nOpção Clientes\n\n");
                //Cliente cliente = new Cliente();
                //cliente.cadastraCliente();
                CadastraCliente cliente = new CadastraCliente();
                cliente.cadastrarCliente();
                break;

            case 2:
                System.out.print("\nOpção Endereço\n");
                break;

            case 3:
                System.out.print("\nFornecedores\n");
                break;

            case 4:
                System.out.print("\nRepresentantes\n");
                break;

            case 5:
                System.out.print("\nUsuários\n");
                break;

            case 6:
                System.out.print("\nConsultas\n");
                break;

            case 7:
                System.out.print("\nSair\n");
                break;
            default:
                System.out.print("\nOpção Inválida!");
                break;
        }
    }
}
