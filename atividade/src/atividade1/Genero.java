package atividade1;

public enum Genero {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");
    
    private char sigla;
    private String texto;

    private Genero(char sigla, String texto) {
        this.sigla = sigla;
        this.texto = texto;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public char getSigla() {
        return sigla;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
