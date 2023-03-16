package javagui;

public class Funcionario extends Pessoa{
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, String matricula, double salario, int id, String nome, int idade, Genero genero, Endereco endereco) {
        super(id, nome, idade, genero, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nNome: " + super.nome +
               "\nIdade: " + super.idade +
               "\nUF: " + super.endereco.uf.sigla +
               "\nGenero: " + super.genero +
               "\nCPF: " + this.cpf +
               "\nRG: " + this.rg +
               "\nSalario: " + this.salario +
               "\nMatrícula: " + this.matricula +
               "\nLogadouro: " + super.endereco.logadouro +
               "\nCEP: " + super.endereco.cidade +
               "\nComplemento: " + super.endereco.complemento +
               "\nNúmero: " + super.endereco.numero ;
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
