package model;

public class Piloto {

    //int identificacao;
    private String nome;
    private String identidade;
    private String cpf;
    private String numeroBrever;
    private String logradouro;
    private String numero;
    private Cidade cidade;
    private String telefone;

    public Piloto() {
    }

    public Piloto(/*int identificacao,*/ String nome, String identidade, String cpf, 
            String numeroBrever, String logradouro, String numero, Cidade cidade, String telefone) {
        //this.identificacao = identificacao;
        this.nome = nome;
        this.identidade = identidade;
        this.cpf = cpf;
        this.numeroBrever = numeroBrever;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.telefone = telefone;
    }

    /*public int getIdentificacao() {
        return identificacao;
    }*/

    /*public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroBrever() {
        return numeroBrever;
    }

    public void setNumeroBrever(String numeroBrever) {
        this.numeroBrever = numeroBrever;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

    public void consultar() {
        //System.out.println("Identificador de Piloto: " + identificacao);
        System.out.println("Nome: " + nome);
        System.out.println("Identidade: " + identidade);
        System.out.println("CPF: " + cpf);
        System.out.println("Número do Breve: " + numeroBrever);
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Numero: " + numero);
        System.out.println("===Cidade===");
        cidade.consultar();
        System.out.println("Telefone: " + telefone);
    }

}