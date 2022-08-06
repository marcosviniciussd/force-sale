package br.com.force.sale.pessoa;

import java.util.Scanner;

public class Endereco {
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private TipoEnderecoEnum tipoEndereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public TipoEnderecoEnum getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEnderecoEnum tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    Scanner sc = new Scanner(System.in);
    public void cadastraEndereco() {
        int tipoEnd = 0;

        System.out.println("SELECIONE O TIPO DE ENDEREÇO: ");
        System.out.println("1 - RESIDENCIAL");
        System.out.println("2 - COMERCIAL ");
        System.out.println("3 - ENTREGA ");
        System.out.println("4 - COBRANÇA");
        System.out.println(" ");

        tipoEnd = sc.nextInt();
        if (tipoEnd == 1){
            setTipoEndereco(TipoEnderecoEnum.ENDERECO_RESIDENCIAL);
        } else if (tipoEnd == 2) {
            setTipoEndereco(TipoEnderecoEnum.ENDERECO_COMERCIAL);
        } else if (tipoEnd == 3) {
            setTipoEndereco(TipoEnderecoEnum.ENDERECO_ENTREGA);
        } else if (tipoEnd == 4) {
            setTipoEndereco(TipoEnderecoEnum.ENDERECO_COBRANCA);
        }
        else{
            System.out.println("Opção Inválida.");
        }

        System.out.println("C.E.P");
        this.cep = sc.nextLine();

        System.out.println("Endereço: ");
        this.endereco = sc.nextLine();

        System.out.println("Numero: ");
        this.numero = sc.nextLine();

        System.out.println("Bairro: ");
        this.bairro = sc.nextLine();

        System.out.println("Complemento: ");
        this.complemento = sc.nextLine();

        System.out.println("Cidade: ");
        this.cidade = sc.nextLine();

        System.out.println("Estado: ");
        this.estado = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", tipoEndereco=" + tipoEndereco.getValue().toString() +
                ", sc=" + sc +
                '}';
    }
}
