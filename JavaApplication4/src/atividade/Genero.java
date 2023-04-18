package atividade;


public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private String texto;

    private Genero(String texto) {
        this.texto = texto;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
