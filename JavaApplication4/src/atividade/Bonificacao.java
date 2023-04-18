package atividade;

public enum Bonificacao {
    MOTOBOY(0.1),
    GERENTE(0.2),
    DIRETOR(0.4);
    
    private double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public static Bonificacao getMOTOBOY() {
        return MOTOBOY;
    }

    public static Bonificacao getGERENTE() {
        return GERENTE;
    }

    public static Bonificacao getDIRETOR() {
        return DIRETOR;
    }

    public double getValor() {
        return valor;
    }
    
    
}
