package teste;

import java.time.LocalDate;

public abstract class Fornecedor extends Pessoa{
    protected String cnpj;
    protected String inscricaoEstadual;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String inscricaoEstadual, int id, String nome, int idade, Genero genero, Endereco endereco, LocalDate dataNascimento) {
        super(id, nome, idade, genero, endereco, dataNascimento);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
}
