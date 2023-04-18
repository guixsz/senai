package atividade;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

    public Gerente() {
    }

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataAdmissao);
    }

    @Override
    public double getSalarioFinal(double salarioFinal) {
        salarioFinal = salarioBase + (salarioBase * Bonificacao.GERENTE.getValor());
        return salarioFinal;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + super.nome +
               "\nCPF: " + super.cpf +
               "\nRG: " + super.rg +
               "\nGenero: " + super.getGenero() +
               "\nSalario Base: " + Util.formatarBrl(salarioBase) +
               "\nData de Admissao: " + Util.formatarData(dataAdmissao) +
               "\nBonificacao: " + super.bonificacao +
               "\nSalario final: " + this.getSalarioFinal(salarioBase); 
    }
}
