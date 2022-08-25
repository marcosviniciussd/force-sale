package br.com.force.sale.produto;

import java.math.BigDecimal;

public class Derivacao {

    private String codDerivacao;
    private String descricaoDerivacao;
    private String situacaoDerivacao;
    private BigDecimal pesoLiquido;
    private BigDecimal pesoBruto;
    private BigDecimal volumeDerivacao;

    public String getCodDerivacao() {
        return codDerivacao;
    }

    public void setCodDerivacao(String codDerivacao) {
        this.codDerivacao = codDerivacao;
    }

    public String getDescricaoDerivacao() {
        return descricaoDerivacao;
    }

    public void setDescricaoDerivacao(String descricaoDerivacao) {
        this.descricaoDerivacao = descricaoDerivacao;
    }

    public String getSituacaoDerivacao() {
        return situacaoDerivacao;
    }

    public void setSituacaoDerivacao(String situacaoDerivacao) {
        this.situacaoDerivacao = situacaoDerivacao;
    }

    public BigDecimal getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(BigDecimal pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public BigDecimal getVolumeDerivacao() {
        return volumeDerivacao;
    }

    public void setVolumeDerivacao(BigDecimal volumeDerivacao) {
        this.volumeDerivacao = volumeDerivacao;
    }
}
