package atividade;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca{
    private double PARTICIPACAO_LUCRO = 0.1;

    public Diretor() {
    }

    public Diretor(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(Bonificacao.DIRETOR, nome, cpf, rg, genero, salarioBase, dataAdmissao);
    }

    @Override
    public double getSalarioFinal(double salariobase) {
        double salarioFinal = salarioBase + ((salarioBase * Bonificacao.DIRETOR.getValor()) + (salarioBase * PARTICIPACAO_LUCRO));
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
               "\nSalario final: " + Util.formatarBrl(getSalarioFinal(salarioBase)); 
    }
    
    
}
