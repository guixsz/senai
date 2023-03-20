package javagui;

public enum UnidadeFederativa {
    BAHIA("BA", "Bahia"),
    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janiero");

    protected String nome1;
    protected String sigla;

    private UnidadeFederativa(String sigla, String nome1) {
        this.nome1 = nome1;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome1;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}