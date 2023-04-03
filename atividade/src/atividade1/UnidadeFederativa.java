package atividade1;

public enum UnidadeFederativa {
    
    ACRE("Acre", "AC"),
    ALAGOAS("Alagoas", "Al"),
    AMAPA("Amapa", "AP"),
    AMAZONAS("Amazonas", "AM"),
    BAHIA("Bahia", "BA"),
    CEARA("Ceara", "CE"),
    ESPIRITO_SANTO("Espirito Santo", "ES"),
    GOIAS("Goias", "GO"),
    MARANHAO("Maranhao", "MA"),
    MATO_GROSSO_DO_SUL("Mato grosso do sul", "MT"),
    MINAS_GERAIS("Minas Gerais", "MG"),
    PARA("Para", "PA"),
    PARAIBA("Paraiba", "PB"),
    PARANA("Parana", "PR"),
    PERNAMBUCO("Pernambuco", "PE"),
    PIAUI("Piaui", "PI"),
    RIO_DE_JANIERO("Rio de Janeiro", "RJ"),
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"),
    RONDONIA("Rondonia", "RO"),
    RORAIMA("Roraima", "RR"),
    SANTA_CATARINA("Santa Catarina", "SC"),
    SAO_PAULO("Sao paulo", "SP"),
    SERGIPE("Sergipe", "SE"),
    TOCANTINS("Tocantins", "TO"),
    DISTRITO_FEDERAL("Distrito Federal", "DF");
    
    private String nome;
    private String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public static UnidadeFederativa getACRE() {
        return ACRE;
    }

    public static UnidadeFederativa getALAGOAS() {
        return ALAGOAS;
    }

    public static UnidadeFederativa getAMAPA() {
        return AMAPA;
    }

    public static UnidadeFederativa getAMAZONAS() {
        return AMAZONAS;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getCEARA() {
        return CEARA;
    }

    public static UnidadeFederativa getESPIRITO_SANTO() {
        return ESPIRITO_SANTO;
    }

    public static UnidadeFederativa getGOIAS() {
        return GOIAS;
    }

    public static UnidadeFederativa getMARANHAO() {
        return MARANHAO;
    }

    public static UnidadeFederativa getMATO_GROSSO_DO_SUL() {
        return MATO_GROSSO_DO_SUL;
    }

    public static UnidadeFederativa getMINAS_GERAIS() {
        return MINAS_GERAIS;
    }

    public static UnidadeFederativa getPARA() {
        return PARA;
    }

    public static UnidadeFederativa getPARAIBA() {
        return PARAIBA;
    }

    public static UnidadeFederativa getPARANA() {
        return PARANA;
    }

    public static UnidadeFederativa getPERNAMBUCO() {
        return PERNAMBUCO;
    }

    public static UnidadeFederativa getPIAUI() {
        return PIAUI;
    }

    public static UnidadeFederativa getRIO_DE_JANIERO() {
        return RIO_DE_JANIERO;
    }

    public static UnidadeFederativa getRIO_GRANDE_DO_NORTE() {
        return RIO_GRANDE_DO_NORTE;
    }

    public static UnidadeFederativa getRIO_GRANDE_DO_SUL() {
        return RIO_GRANDE_DO_SUL;
    }

    public static UnidadeFederativa getRONDONIA() {
        return RONDONIA;
    }

    public static UnidadeFederativa getRORAIMA() {
        return RORAIMA;
    }

    public static UnidadeFederativa getSANTA_CATARINA() {
        return SANTA_CATARINA;
    }

    public static UnidadeFederativa getSAO_PAULO() {
        return SAO_PAULO;
    }

    public static UnidadeFederativa getSERGIPE() {
        return SERGIPE;
    }

    public static UnidadeFederativa getTOCANTINS() {
        return TOCANTINS;
    }

    public static UnidadeFederativa getDISTRITO_FEDERAL() {
        return DISTRITO_FEDERAL;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
