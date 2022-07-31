package br.com.force.sale.pessoa;

public class Pessoa {
    public enum TipoPessoa{PESSOA_FISICA, PESSOA_JURIDICA}

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;
    private String nome;
    private String cgcCpf;
    private TipoPessoa tipoPessoa;

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
            setCgcCpf(cgcCpf, tipoPessoa = TipoPessoa.PESSOA_FISICA);
            //tipoPessoa = TipoPessoa.PESSOA_FISICA;
        } else if (cgcCpf.length() == TAMANHO_CNPJ) {
            setCgcCpf(cgcCpf, tipoPessoa = TipoPessoa.PESSOA_JURIDICA);
            //tipoPessoa = TipoPessoa.PESSOA_JURIDICA;
        }
        else{
            throw new NullPointerException(getClass().toString() + " Erro-PES001: Documento inválido para Pessoa Física ou Pessoa Jurídica. ");
        }
    }

    private void setCgcCpf(String cgcCpf, TipoPessoa tipoPessoa){
        this.cgcCpf = cgcCpf;
        this.tipoPessoa = tipoPessoa;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
