package javagui;

public class Medico extends Funcionario {
    protected String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String matricula, double salario, Setor setor, int id, String nome, int idade, Genero genero, Endereco endereco) {
        super(cpf, rg, matricula, salario, setor, id, nome, idade, genero, endereco);
        this.crm = crm;
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
               "\nCRM: " + this.crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
}
