package javagui;

public enum Genero {
    MASCULINO('M'),
    FEMININO('F');
    
    protected char valor;

    private Genero(char valor) {
        this.valor = valor;
    }

    public char getValor() {
        return valor;
    }
    
    
    
}