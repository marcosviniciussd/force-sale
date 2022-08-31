package br.com.force.sale.pessoa;

import java.util.Scanner;

public class CadastraCliente {

    public Cliente cadastrarCliente(){
        Scanner sc = new Scanner(System.in);

        Cliente cli = new Cliente();
        System.out.print("Nome: ");
        cli.setNome(sc.nextLine());

        System.out.print("C.P.F: ");
        cli.setCgcCpf(sc.nextLine());

        if(cli.getCgcCpf().length() == Pessoa.TAMANHO_CPF){
            cli.setTipoPessoa(TipoPessoaEnum.PESSOA_FISICA);
        } else if (cli.getCgcCpf().length() == Pessoa.TAMANHO_CNPJ) {
            cli.setTipoPessoa(TipoPessoaEnum.PESSOA_JURIDICA);
        } else {
            cli.setTipoPessoa(null);
        }

        cli.setSitCliente(true);

        System.out.print("Tipo do Documento: ");
        cli.setTipoDocumento(sc.nextLine());

        System.out.print("Nro. Documento: ");
        cli.setDocIdentificacao(sc.nextLine());

        System.out.print("Nascimento: ");
        cli.setDataNascimento(sc.nextLine());

        return cli;
    }
}
