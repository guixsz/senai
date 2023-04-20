package operacao;

public class Soma implements OperacaoMatematica{

    @Override
    public double operacao(double a, double b) {
        return a + b;
    }
    
}
