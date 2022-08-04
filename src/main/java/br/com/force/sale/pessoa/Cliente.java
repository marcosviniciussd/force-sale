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
        String nome = "";
        String nascimento = "";
        String cgccpf = "";
        String tipoDocumento = "";
        String documento = "";

        System.out.print("Nome: ");
        this.setNome(sc.nextLine());
        //nome = sc.nextLine();
        //setNome(nome);

        System.out.print("C.P.F: ");
        this.setCgcCpf(sc.nextLine());
        //cgccpf = sc.nextLine();
        //setCgcCpf(cgccpf);

        System.out.print("Tipo do Documento: ");
        this.setTipoDocumento(sc.nextLine());
        //tipoDocumento = sc.nextLine();
        //setTipoDocumento(tipoDocumento);

        System.out.print("Nro. Documento: ");
        this.setDocIdentificacao(sc.nextLine());
        //documento = sc.nextLine();
        //setTipoDocumento(documento);

        System.out.print("Nascimento: ");
        this.setDataNascimento(sc.nextLine());
        //nascimento = sc.nextLine();
        //setDataNascimento(nascimento);
    }
}
