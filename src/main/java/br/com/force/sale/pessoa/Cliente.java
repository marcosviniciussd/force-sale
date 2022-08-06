package br.com.force.sale.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Pessoa {
    private int codCliente;
    private Boolean sitCliente;
    private String docIdentificacao;
    private String tipoDocumento;
    private String dataNascimento;
    private List<Endereco> enderecos;

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public Boolean getSitCliente() {
        return sitCliente;
    }

    public void setSitCliente(Boolean sitCliente) {
        this.sitCliente = sitCliente;
    }

    public String getDocIdentificacao() {
        return docIdentificacao;
    }

    public void setDocIdentificacao(String docIdentificacao) {
        this.docIdentificacao = docIdentificacao;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Endereco> getEnderecos() {
        if(enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

    public void  adicionaEndereco(Endereco endereco){
        if(endereco.getEndereco() == null){
            throw new NullPointerException(getClass().toString() + " Erro-CLI001: Endereço não pode ser nulo. ");
        }
        if(endereco.getCep() == null){
            throw new NullPointerException(getClass().toString() + " Erro-CLI002: C.E.P não pode ser nulo.");
        }
        if(endereco.getBairro() == null){
            throw new NullPointerException(getClass().toString() + " Erro-CLI003: Bairro não pode ser nulo.");
        }
        if(endereco.getCidade() == null){
            throw new NullPointerException(getClass().toString() + " Erro-CLI004: Cidade não pode ser nulo.");
        }
        if(endereco.getEstado() == null){
            throw new NullPointerException(getClass().toString() + " Erro-CLI005: Estado (UF) não pode ser nulo.");
        }
        getEnderecos().add(endereco);
    }

    Scanner sc = new Scanner(System.in);
    public void cadastraCliente() {

        System.out.print("Nome: ");
        this.nome = sc.nextLine();

        System.out.print("C.P.F: ");
        this.cgcCpf = sc.nextLine();

        if(this.cgcCpf.length() == TAMANHO_CPF){
           this.tipoPessoa = TipoPessoaEnum.PESSOA_FISICA;
        } else if (this.cgcCpf.length() == TAMANHO_CNPJ) {
            this.tipoPessoa = TipoPessoaEnum.PESSOA_JURIDICA;
        } else {
            this.tipoPessoa = null;
        }

        this.sitCliente = true;

        System.out.print("Tipo do Documento: ");
        this.tipoDocumento = sc.nextLine();

        System.out.print("Nro. Documento: ");
        this.docIdentificacao = sc.nextLine();

        System.out.print("Nascimento: ");
        this.dataNascimento = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codCliente=" + codCliente +
                ", sitCliente=" + sitCliente +
                ", docIdentificacao='" + docIdentificacao + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", enderecos=" + enderecos +
                ", nome='" + nome + '\'' +
                ", cgcCpf='" + cgcCpf + '\'' +
                ", tipoPessoa=" + tipoPessoa.getValue().toString() +
                '}';
    }
}
