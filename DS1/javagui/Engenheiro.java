package javagui;

public class Engenheiro extends Funcionario {
    protected String crea;

    public Engenheiro() {
    }

    public Engenheiro(String crea, String cpf, String rg, String matricula, double salario, Setor setor, int id, String nome, int idade, Genero genero, Endereco endereco) {
        super(cpf, rg, matricula, salario, setor, id, nome, idade, genero, endereco);
        this.crea = crea;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + super.nome +
               "\nIdade: " + super.idade +
               "\nUF: " + super.endereco.uf.sigla +
               "\nGenero: " + super.genero +
               "\nCPF: " + super.cpf +
               "\nRG: " + super.rg +
               "\nSalario: " + super.salario +
               "\nMatrícula: " + super.matricula +
               "\nLogadouro: " + super.endereco.logadouro +
               "\nCEP: " + super.endereco.cidade +
               "\nComplemento: " + super.endereco.complemento +
               "\nNumero: " + super.endereco.numero +
               "\nCREA: " + this.crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    
}