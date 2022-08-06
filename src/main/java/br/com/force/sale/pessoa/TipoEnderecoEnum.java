package br.com.force.sale.pessoa;

public enum TipoEnderecoEnum {
    ENDERECO_RESIDENCIAL("Residencial"),
    ENDERECO_COMERCIAL("Comercial"),
    ENDERECO_ENTREGA("Entrega"),
    ENDERECO_COBRANCA("Cobrança");

    private final String value;

    TipoEnderecoEnum(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
