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

    private List<Endereco> getEnderecos() {
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

        System.out.println("Nome: ");
        nome = sc.nextLine();
        setNome(nome);

        System.out.println("C.P.F: ");
        cgccpf = sc.nextLine();
        setCgcCpf(cgccpf);

        System.out.println("Tipo do Documento: ");
        tipoDocumento = sc.nextLine();
        setTipoDocumento(tipoDocumento);

        System.out.println("Nro. Documento: ");
        documento = sc.nextLine();
        setTipoDocumento(documento);

        System.out.println("Nascimento: ");
        nascimento = sc.nextLine();
        setDataNascimento(nascimento);

        Endereco end = new Endereco();
        end.cadastraEndereco();
        adicionaEndereco(end);
    }

    /*
    public void cadastraCliente() {
        String nome = "";
        String nascimento = "";
        String cgccpf = "";
        int tipoEnd = 0;
        String endereco = "";
        String numero = "";
        String bairro = "";
        String complemento = "";
        String cidade = "";
        String cep = "";
        String estado = "";
        String tipoDocumento = "";
        String documento = "";

        System.out.println("Nome: ");
        nome = sc.nextLine();
        setNome(nome);

        System.out.println("C.P.F: ");
        cgccpf = sc.nextLine();
        setCgcCpf(cgccpf);

        System.out.println("Tipo do Documento: ");
        tipoDocumento = sc.nextLine();
        setTipoDocumento(tipoDocumento);

        System.out.println("Nro. Documento: ");
        documento = sc.nextLine();
        setTipoDocumento(documento);

        System.out.println("Nascimento: ");
        nascimento = sc.nextLine();
        setDataNascimento(nascimento);

        Endereco end = new Endereco();
        System.out.println("SELECIONE O TIPO DE ENDEREÇO: ");
        System.out.println("1 - RESIDENCIAL");
        System.out.println("2 - COMERCIAL ");
        System.out.println("3 - ENTREGA ");
        System.out.println("4 - COBRANÇA");
        System.out.println(" ");
        tipoEnd = sc.nextInt();
        if (tipoEnd == 1){
            end.setTipoEndereco(Endereco.TipoEndereco.ENDERECO_RESIDENCIAL);
        } else if (tipoEnd == 2) {
            end.setTipoEndereco(Endereco.TipoEndereco.ENDERECO_COMERCIAL);
        } else if (tipoEnd == 3) {
            end.setTipoEndereco(Endereco.TipoEndereco.ENDERECO_ENTREGA);
        } else if (tipoEnd == 4) {
            end.setTipoEndereco(Endereco.TipoEndereco.ENDERECO_COBRANCA);
        }
        else{
            System.out.println("Opção Inválida.");
        }

        System.out.println("C.E.P");
        cep = sc.nextLine();
        end.setCep(cep);

        System.out.println("Endereço: ");
        endereco = sc.nextLine();
        end.setEndereco(endereco);

        System.out.println("Numero: ");
        numero = sc.nextLine();
        end.setNumero(numero);

        System.out.println("Bairro: ");
        bairro = sc.nextLine();
        end.setBairro(bairro);

        System.out.println("Complemento: ");
        complemento = sc.nextLine();
        end.setComplemento(complemento);

        System.out.println("Cidade: ");
        cidade = sc.nextLine();
        end.setCidade(cidade);

        System.out.println("Estado: ");
        estado = sc.nextLine();
        end.setEstado(estado);
    }
    */
}
