package teste;

public enum Genero {
    MASCULINO('M'),
    FEMININO('F');
    
    private char letra;

    private Genero(char letra) {
        this.letra = letra;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public char getLetra() {
        return letra;
    }
    
    
}
