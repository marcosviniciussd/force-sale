package br.com.force.sale.pessoa;

import java.util.Scanner;

public class CadastraEndereco {

    public void cadastraEndereco() {
        Scanner sc = new Scanner(System.in);

        Endereco end = new Endereco();
        int tipoEnd = 0;

        System.out.println("SELECIONE O TIPO DE ENDEREÇO: ");
        System.out.println("1 - RESIDENCIAL");
        System.out.println("2 - COMERCIAL ");
        System.out.println("3 - ENTREGA ");
        System.out.println("4 - COBRANÇA");
        System.out.println(" ");

        tipoEnd = sc.nextInt();
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

        System.out.print("Endereço: ");
        end.setEndereco(sc.nextLine());

        System.out.print("Numero: ");
        end.setNumero(sc.nextLine());

        System.out.print("Bairro: ");
        end.setBairro(sc.nextLine());

        System.out.print("Complemento: ");
        end.setComplemento(sc.nextLine());

        System.out.print("Cidade: ");
        end.setCidade(sc.nextLine());

        System.out.print("Estado: ");
        end.setEstado(sc.nextLine());
    }
}
