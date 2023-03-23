package teste;

import java.time.LocalDate;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro() {
    }

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, int idade, Genero genero, Endereco endereco, LocalDate dataNascimento) {
        super(cpf, rg, matricula, setor, salario, id, nome, idade, genero, endereco, dataNascimento);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
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
                "CREA: " + this.crea;
    }
}
