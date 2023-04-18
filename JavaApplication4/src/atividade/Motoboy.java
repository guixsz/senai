package atividade;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String placaDeMoto;

    public Motoboy() {
    }

    public Motoboy(String placaDeMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataAdmissao);
        this.placaDeMoto = placaDeMoto;
    }

    public String getPlacaDeMoto() {
        return placaDeMoto;
    }

    public void setPlacaDeMoto(String placaDeMoto) {
        this.placaDeMoto = placaDeMoto;
    }

   
    public String getSalarioFinalFormatado(double salarioBase) {
        return Util.formatarBrl(this.salarioBase);
    }

    @Override
    public double getSalarioFinal(double salariobase) {
       return salarioBase; 
    }
    @Override
    public String toString() {
        return "\nNome: " + super.nome +
               "\nCPF: " + super.cpf +
               "\nRG: " + super.rg +
               "\nGenero: " + super.getGenero() +
               "\nSalario Base: " + Util.formatarBrl(salarioBase) +
               "\nData de Admissao: " + Util.formatarData(dataAdmissao) +
               "\nPlaca da moto: " + this.placaDeMoto +
               "\nSalario final: " + Util.formatarBrl(getSalarioFinal(salarioBase)); 
    }
    
    
}
