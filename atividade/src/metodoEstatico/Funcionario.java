package metodoEstatico;

import java.time.LocalDate;
import java.time.Period;
        
public class Funcionario extends Pessoa{
    private Genero genero;
    private String cpf;
    private String rg;
    private LocalDate date;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(Genero genero, String cpf, String rg, LocalDate date, double salario, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.genero = genero;
        this.cpf = cpf;
        this.rg = rg;
        this.date = date;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nNome: " + super.nome +
               "\nID: " + super.id +
               "\nTelefone: " + super.telefone +
               "\nLogradouro: " + super.endereco.logradouro +
               "\nNumero: " + super.endereco.numero +
               "\nComplemento: " + super.endereco.complemento +
               "\nCEP: " + super.endereco.cep +
               "\nCidade: " + super.endereco.cidade +
               "\nUF: " + super.endereco.uf +
               "\nGenero: " + this.genero.getTexto() +
               "\nCPF: " + this.cpf +
               "\nRG: " + this.rg +
               "\nData de nascimento: " + Util.FormatarData(date) +
               "\nSalario: " + Util.FormatarMoeda(salario) +
               "\nIdade: " + this.getidade(date);
    }    
    
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public  int getidade(LocalDate date){
        Period calcularIdade = Period.between(date, LocalDate.now());
        return calcularIdade.getYears();
    }
}
