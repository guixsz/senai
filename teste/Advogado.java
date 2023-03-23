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
                "\nUF: " + super.endereco.uf.getSigla() +
                "\nOAB: " + this.oab +
                "\nSalario: " + super.salario +
                "\nSetor: " + super.setor +
                "\nMatricula" + super.matricula +
                "\nData de nascimento: " + super.getDataNascimento();
                
                
    }
}
