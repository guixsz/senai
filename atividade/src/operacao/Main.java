package operacao;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Divisao divisao = new Divisao();
        Mutiplicacao mutiplicacao = new Mutiplicacao();
        Subtracao subtracao = new Subtracao();
        
        
        System.out.println(soma.operacao(4, 6));
        System.out.println(divisao.operacao(10, 2));
        System.out.println(mutiplicacao.operacao(2, 2));
        System.out.println(subtracao.operacao(10, 5));
    }
}
