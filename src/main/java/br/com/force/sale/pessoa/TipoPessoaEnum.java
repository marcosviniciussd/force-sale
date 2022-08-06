package br.com.force.sale.pessoa;

public enum TipoPessoaEnum {

    PESSOA_FISICA("PF"),

    PESSOA_JURIDICA("PJ");

    private String value;

    TipoPessoaEnum(String value) {

    }

    public String getValue(){
        return value;
    }
}
