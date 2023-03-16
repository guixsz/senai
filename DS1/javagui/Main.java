package javagui;

public class Main {

    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario("0123456", "6543210", "890654", 1995.23, 2, "Maria", 22, Genero.FEMININO, 
                            new Endereco("Rua das Alamedas", "179", "academia Smart fit", "0987654", "Salvador",
                                    UnidadeFederativa.BAHIA));

        System.out.println(fun1.toString());
        
        Fornecedor for1 = new Fornecedor("1234567", "15451", 234156, "João", 40, Genero.MASCULINO, 
                            new Endereco("Colegio estadual Alípio Franco", "265", "Praça Dendezeiros", "243516", "Lauro de Freitas",
                                UnidadeFederativa.BAHIA));
        
        System.out.println(for1.toString());
    }
}
