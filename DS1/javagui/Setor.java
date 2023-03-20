package javagui;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídica");
    
    protected String nome2;

    private Setor(String nome2) {
        this.nome2 = nome2;
    }

    public String getNome2() {
        return nome2;
    }
    
}
