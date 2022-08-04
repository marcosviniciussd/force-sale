package br.com.force.sale;

import br.com.force.sale.pessoa.Cliente;
import br.com.force.sale.pessoa.Endereco;

public class Programa {
    public static void main(String[] args) {

        Cliente cli = new Cliente();
        cli.cadastraCliente();

        Endereco end = new Endereco();
        end.cadastraEndereco();
        cli.adicionaEndereco(end);


        System.out.println("Mostrando o Cliente");
        System.out.println(cli.getNome());
        System.out.println(cli.getDataNascimento());
        System.out.println(cli.getEnderecos());


        /*
        Endereco  enderecoResidencial = new Endereco();
        enderecoResidencial.setTipoEndereco(Endereco.TipoEndereco.ENDERECO_RESIDENCIAL);
        enderecoResidencial.setEndereco("Rua Amélio Massa");
        enderecoResidencial.setNumero("141");
        enderecoResidencial.setBairro("Laranjeiras II");
        enderecoResidencial.setComplemento("Casa");
        enderecoResidencial.setCidade("Uberaba");
        enderecoResidencial.setEstado("Minas Gerais");
        enderecoResidencial.setCep("38046-626");

        Endereco  enderecoCobranca = new Endereco();
        enderecoCobranca.setTipoEndereco(Endereco.TipoEndereco.ENDERECO_COBRANCA);
        enderecoCobranca.setEndereco("Rua Francisco Fava");
        enderecoCobranca.setNumero("425");
        enderecoCobranca.setBairro("Universitário");
        enderecoCobranca.setComplemento("Apto 201");
        enderecoCobranca.setCidade("Uberaba");
        enderecoCobranca.setEstado("Minas Gerais");
        enderecoCobranca.setCep("38050-550");

        Cliente cliente = new Cliente();
        cliente.setCodCliente(1);
        cliente.setNome("Marcos Damasceno");
        cliente.setCgcCpf("03664829557");
        //cliente.setTipoPessoa(Pessoa.TipoPessoa.PESSOA_FISICA);
        cliente.setDataNascimento("09/11/1988");
        cliente.setTipoDocumento("RG");
        cliente.setDocIdentificacao("14953536-80 (SSP-BA)");
        cliente.setSitCliente(true);

        try {
            cliente.adicionaEndereco(enderecoCobranca);
            cliente.adicionaEndereco(enderecoResidencial);

            System.out.println("Código: " + cliente.getCodCliente());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Tipo de Pessoa: " + cliente.getTipoPessoa());
            System.out.println(enderecoResidencial.getTipoEndereco().toString() + ": " + enderecoResidencial.getEndereco());
            System.out.println(enderecoCobranca.getTipoEndereco().toString()  + ": " + enderecoCobranca.getEndereco());
            System.out.println("Endereço adicionado com sucesso.");

        } catch (Exception e){
            System.err.println("Houve um erro ao adicionar endereço " + e.getMessage());
        }
        */
    }
}
