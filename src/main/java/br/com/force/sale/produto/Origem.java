package br.com.force.sale.produto;

public class Origem {
    private String codOrigem;
    private String tipoProduto; //P: Produzido, C: Comprado, M: Montado, D: Passagem Direta, S: Serviço
    private String descricaoOrigem;
    private Boolean controlaLote;
    private Boolean controlaSerie;
    private Boolean controlaValidade;
    private String depositoPadrao;
    private String situacaoOrigem;

    public void setSituacaoOrigem(String situacaoOrigem) {
        this.situacaoOrigem = situacaoOrigem;
    }

    public String getCodOrigem() {
        return codOrigem;
    }

    public void setCodOrigem(String codOrigem) {
        this.codOrigem = codOrigem;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getDescricaoOrigem() {
        return descricaoOrigem;
    }

    public void setDescricaoOrigem(String descricaoOrigem) {
        this.descricaoOrigem = descricaoOrigem;
    }

    public Boolean getControlaLote() {
        return controlaLote;
    }

    public void setControlaLote(Boolean controlaLote) {
        this.controlaLote = controlaLote;
    }

    public Boolean getControlaSerie() {
        return controlaSerie;
    }

    public void setControlaSerie(Boolean controlaSerie) {
        this.controlaSerie = controlaSerie;
    }

    public Boolean getControlaValidade() {
        return controlaValidade;
    }

    public void setControlaValidade(Boolean controlaValidade) {
        this.controlaValidade = controlaValidade;
    }

    public String getDepositoPadrao() {
        return depositoPadrao;
    }

    public void setDepositoPadrao(String depositoPadrao) {
        this.depositoPadrao = depositoPadrao;
    }

    public String getSituacaoOrigem() {
        return situacaoOrigem;
    }
}
