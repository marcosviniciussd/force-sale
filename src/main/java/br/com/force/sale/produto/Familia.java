package br.com.force.sale.produto;

public class Familia {
    private String codFamilia;
    private String descricaoFamilia;
    private String codOrigem;
    private String unidadeMedida;
    private String derivacao;
    private String depositoPadrao;

    public String getCodFamilia() {
        return codFamilia;
    }

    public void setCodFamilia(String codFamilia) {
        this.codFamilia = codFamilia;
    }

    public String getDescricaoFamilia() {
        return descricaoFamilia;
    }

    public void setDescricaoFamilia(String descricaoFamilia) {
        this.descricaoFamilia = descricaoFamilia;
    }

    public String getCodOrigem() {
        return codOrigem;
    }

    public void setCodOrigem(String codOrigem) {
        this.codOrigem = codOrigem;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getDerivacao() {
        return derivacao;
    }

    public void setDerivacao(String derivacao) {
        this.derivacao = derivacao;
    }

    public String getDepositoPadrao() {
        return depositoPadrao;
    }

    public void setDepositoPadrao(String depositoPadrao) {
        this.depositoPadrao = depositoPadrao;
    }
}
