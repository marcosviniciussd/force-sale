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
    private List<Endereco> enderecos = new ArrayList<>();

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
        return enderecos;
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
