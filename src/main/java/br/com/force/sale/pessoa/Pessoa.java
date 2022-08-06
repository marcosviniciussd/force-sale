package br.com.force.sale.pessoa;

public class Pessoa {
    //public enum TipoPessoa{PESSOA_FISICA, PESSOA_JURIDICA}

    protected static final int TAMANHO_CPF = 11;
    protected static final int TAMANHO_CNPJ = 14;
    protected String nome;
    protected String cgcCpf;
    protected TipoPessoaEnum tipoPessoa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCgcCpf() {
        return cgcCpf;
    }

    public void setCgcCpf(String cgcCpf) {
        if (cgcCpf == null || cgcCpf.isEmpty()) {
            throw new NullPointerException(getClass().toString() + " Erro-PES001: Documento não pode ser nulo ou vazio. ");
        }
        if (cgcCpf.length() == TAMANHO_CPF){
            setCgcCpf(cgcCpf, tipoPessoa = TipoPessoaEnum.PESSOA_FISICA);
            //tipoPessoa = TipoPessoa.PESSOA_FISICA;
        } else if (cgcCpf.length() == TAMANHO_CNPJ) {
            setCgcCpf(cgcCpf, tipoPessoa = TipoPessoaEnum.PESSOA_JURIDICA);
            //tipoPessoa = TipoPessoa.PESSOA_JURIDICA;
        }
        else{
            throw new NullPointerException(getClass().toString() + " Erro-PES001: Documento inválido para Pessoa Física ou Pessoa Jurídica. ");
        }
    }

    private void setCgcCpf(String cgcCpf, TipoPessoaEnum tipoPessoa){
        this.cgcCpf = cgcCpf;
        this.tipoPessoa = tipoPessoa;
    }

    public TipoPessoaEnum getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cgcCpf='" + cgcCpf + '\'' +
                ", tipoPessoa=" + tipoPessoa.getValue().toString() +
                '}';
    }
}
