package teste;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("Sâo Paulo", "SP"),
    RIO_DE_JANIERO("Rio de Janiero", "RJ");
    
    private String nome;
    private String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
