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
    
    
}
