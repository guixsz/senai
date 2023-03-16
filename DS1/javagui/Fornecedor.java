package javagui;

public class Fornecedor extends Pessoa{
    protected String cnpj;
    protected String inscricaoEstadual;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String inscricaoEstadual, int id, String nome, int idade, Genero genero, Endereco endereco) {
        super(id, nome, idade, genero, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
     @Override
    public String toString() {
        return "\nNome: " + super.nome +
               "\nIdade: " + super.idade +
               "\nUF: " + super.endereco.uf.sigla +
               "\nGenero: " + super.genero +
               "\nCNPJ: " + this.cnpj +
               "\nInscrição estadual: " + this.inscricaoEstadual +
               "\nLogadouro: " + super.endereco.logadouro +
               "\nCEP: " + super.endereco.cidade +
               "\nComplemento: " + super.endereco.complemento +
               "\nNúmero: " + super.endereco.numero ;
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
