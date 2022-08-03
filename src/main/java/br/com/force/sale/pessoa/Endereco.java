package br.com.force.sale.pessoa;

import java.util.Scanner;

public class Endereco {

    public enum TipoEndereco {ENDERECO_RESIDENCIAL, ENDERECO_COMERCIAL, ENDERECO_ENTREGA, ENDERECO_COBRANCA}
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private TipoEndereco tipoEndereco;

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

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    Scanner sc = new Scanner(System.in);
    public void cadastraEndereco() {
        int tipoEnd = 0;
        String endereco = "";
        String numero = "";
        String bairro = "";
        String complemento = "";
        String cidade = "";
        String cep = "";
        String estado = "";

        System.out.println("SELECIONE O TIPO DE ENDEREÇO: ");
        System.out.println("1 - RESIDENCIAL");
        System.out.println("2 - COMERCIAL ");
        System.out.println("3 - ENTREGA ");
        System.out.println("4 - COBRANÇA");
        System.out.println(" ");

        tipoEnd = sc.nextInt();
        if (tipoEnd == 1){
            setTipoEndereco(Endereco.TipoEndereco.ENDERECO_RESIDENCIAL);
        } else if (tipoEnd == 2) {
            setTipoEndereco(Endereco.TipoEndereco.ENDERECO_COMERCIAL);
        } else if (tipoEnd == 3) {
            setTipoEndereco(Endereco.TipoEndereco.ENDERECO_ENTREGA);
        } else if (tipoEnd == 4) {
            setTipoEndereco(Endereco.TipoEndereco.ENDERECO_COBRANCA);
        }
        else{
            System.out.println("Opção Inválida.");
        }

        System.out.println("C.E.P");
        cep = sc.nextLine();
        setCep(cep);

        System.out.println("Endereço: ");
        endereco = sc.nextLine();
        setEndereco(endereco);

        System.out.println("Numero: ");
        numero = sc.nextLine();
        setNumero(numero);

        System.out.println("Bairro: ");
        bairro = sc.nextLine();
        setBairro(bairro);

        System.out.println("Complemento: ");
        complemento = sc.nextLine();
        setComplemento(complemento);

        System.out.println("Cidade: ");
        cidade = sc.nextLine();
        setCidade(cidade);

        System.out.println("Estado: ");
        estado = sc.nextLine();
        setEstado(estado);
    }
}
