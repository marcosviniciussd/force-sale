package br.com.force.sale.pessoa;

import java.util.Scanner;

public class CadastraCliente extends Cliente {

    Scanner sc = new Scanner(System.in);

    public void cadastraClientes(){
        Cliente cadastroCliente = new Cliente();

        System.out.println("Nome: ");
        cadastroCliente.setNome(sc.nextLine());

        System.out.println("C.P.F: ");
        cadastroCliente.setCgcCpf(sc.nextLine());

        System.out.println("Tipo do Documento: ");
        cadastroCliente.setTipoDocumento(sc.nextLine());

        System.out.println("Nro. Documento: ");
        cadastroCliente.setDocIdentificacao(sc.nextLine());

        System.out.println("Nascimento: ");
        cadastroCliente.setDataNascimento(sc.nextLine());
    }
}
