package javagui;

public class Main {

    public static void main(String[] args) {
        Medico med1 = new Medico("12345", "543210", "43526", "987409", 1997.5, Setor.SAUDE, 987042, "Júlia", 24, Genero.FEMININO,
                        new Endereco("rua das Alamedas", "12", "Em frente à ultragas", "1547364", "Feira de Santana", UnidadeFederativa.BAHIA));

        System.out.println(med1.toString());
        
        Engenheiro eng1 = new Engenheiro("12345", "56789", "98765", "7498728", 2.500, Setor.ENGENHARIA, 9879654, "Henrique", 30, Genero.MASCULINO,
                            new Endereco("Cajazeiras", "132", "Em frente a padaria paz", "14253", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        System.out.println(eng1.toString());
        
        Fornecedor for1 = new Fornecedor("1234567", "15451", 234156, "João", 40, Genero.MASCULINO, 
                            new Endereco("Colegio estadual Alípio Franco", "265", "Praça Dendezeiros", "243516", "Lauro de Freitas",
                                UnidadeFederativa.BAHIA));
        
        System.out.println(for1.toString());
    }
}