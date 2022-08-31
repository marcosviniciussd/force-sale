package br.com.force.sale.pessoa;

import java.util.Scanner;

public class CadastraEndereco {

    public Endereco cadastraEndereco() {
        Scanner sc = new Scanner(System.in);

        Endereco end = new Endereco();
        int tipoEnd = 0;

        System.out.println("SELECIONE O TIPO DE ENDEREÇO: ");
        System.out.println("1 - RESIDENCIAL");
        System.out.println("2 - COMERCIAL ");
        System.out.println("3 - ENTREGA ");
        System.out.println("4 - COBRANÇA");
        System.out.println(" ");

        tipoEnd =Integer.parseInt(sc.nextLine());
        if (tipoEnd == 1){
            end.setTipoEndereco(TipoEnderecoEnum.ENDERECO_RESIDENCIAL);
        } else if (tipoEnd == 2) {
            end.setTipoEndereco(TipoEnderecoEnum.ENDERECO_COMERCIAL);
        } else if (tipoEnd == 3) {
            end.setTipoEndereco(TipoEnderecoEnum.ENDERECO_ENTREGA);
        } else if (tipoEnd == 4) {
            end.setTipoEndereco(TipoEnderecoEnum.ENDERECO_COBRANCA);
        }
        else{
            System.out.println("Opção Inválida.");
        }

        System.out.print("C.E.P: ");
        end.setCep(sc.nextLine());
        System.out.println(end.getCep());
        if(end.getCep() == null || end.getCep() == "")
            throw new NullPointerException(getClass().toString() + " Erro-CLI002: C.E.P não pode ser nulo.");

        System.out.print("Endereço: ");
        end.setEndereco(sc.nextLine());
        if(end.getEndereco() == null || end.getEndereco() == "")
            throw new NullPointerException(getClass().toString() + " Erro-END001: Endereço não pode ser nulo. ");

        System.out.print("Numero: ");
        end.setNumero(sc.nextLine());

        System.out.print("Bairro: ");
        end.setBairro(sc.nextLine());
        if(end.getBairro() == null || end.getBairro() == "")
            throw new NullPointerException(getClass().toString() + " Erro-CLI003: Bairro não pode ser nulo.");

        System.out.print("Complemento: ");
        end.setComplemento(sc.nextLine());

        System.out.print("Cidade: ");
        end.setCidade(sc.nextLine());
        if(end.getCidade() == null || end.getCidade() == "")
            throw new NullPointerException(getClass().toString() + " Erro-CLI004: Cidade não pode ser nulo.");

        System.out.print("Estado: ");
        end.setEstado(sc.nextLine());
        if(end.getEstado() == null || end.getEstado() == "")
            throw new NullPointerException(getClass().toString() + " Erro-CLI005: Estado (UF) não pode ser nulo.");

        return end;
    }
}
