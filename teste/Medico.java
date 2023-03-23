package teste;

import java.time.LocalDate;

public class Medico extends Funcionario{
    private String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, int idade, Genero genero, Endereco endereco, LocalDate dataNascimento) {
        super(cpf, rg, matricula, setor, salario, id, nome, idade, genero, endereco, dataNascimento);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\nNome: " + super.nome +
                "\nId: " + super.id +
                "\nIdade: " + super.idade +
                "\nGenero: " + super.genero +
                "\nLogadouro: " + super.endereco.logadouro +
                "\nNumero: " + super.endereco.numero +
                "\nCEP: " + super.endereco.cep +
                "\nCidade: " + super.endereco.cidade +
                "\nUF: " + super.endereco.uf +
                "CRM: " + this.crm;
    }
    
    
}
