package teste;

import java.time.LocalDate;

public class Advogado extends Funcionario{
    private String oab;

    public Advogado() {
    }

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, int idade, Genero genero, Endereco endereco, LocalDate dataNascimento) {
        super(cpf, rg, matricula, setor, salario, id, nome, idade, genero, endereco, dataNascimento);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    
    
}
