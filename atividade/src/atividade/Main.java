package atividade;
public class Main {
    public static void main(String[] args) {
        
        Atributo carac = new Atributo("joão", 1200, 5000 );
        
        System.out.println("Nome: " + carac.getNome());
        System.out.println("Salário fixo: " + carac.getSalarioFixo());
        System.out.println("Total de vendas: " + carac.getTotalVendasl());
        System.out.println("Valor final do mês: " + carac.valorFinal());
    }
}