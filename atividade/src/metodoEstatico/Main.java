package metodoEstatico;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario(Genero.FEMININO, "12345", "12345", LocalDate.of(1999, Month.JANUARY, 3), 3400, 12345, "Joyce", "12345",
                            new Endereco("....", "847", "....", "....", "Salvador", "BA"));
        
        System.out.println(f1.toString());
        
        Juridica j1 = new Juridica("12345", "12345", LocalDate.of(1995, Month.AUGUST, 12), LocalDate.of(2000, Month.MARCH, 14), 120000, 12345, "Juliana", "12345",
                            new Endereco("....", "847", "....", "....", "Salvador", "BA"));
    
        System.out.println(j1.toString());
    }
}
