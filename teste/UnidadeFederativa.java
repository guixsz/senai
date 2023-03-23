package teste;

public enum UnidadeFederativa {
    BAHIA("BA"),
    SAO_PAULO("SP"),
    RIO_DE_JANIERO("RJ");
    
    private String sigla;

    private UnidadeFederativa(String sigla) {
        this.sigla = sigla;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getSAO_PAULO() {
        return SAO_PAULO;
    }

    public static UnidadeFederativa getRIO_DE_JANIERO() {
        return RIO_DE_JANIERO;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
