package teste;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Advogado ad1 = new Advogado("123456","1546321" ,"56.56.5.", "415648", Setor.JURIDICO, 1990, 15462, "lucas", 25, Genero.MASCULINO, 
                new Endereco("Rua das petalas", "123", "em frente a smartfit","47874-240", "Brasil de pelotas", UnidadeFederativa.SAO_PAULO), LocalDate.of(2005, Month.JUNE, 23));
        
        System.out.println(ad1.toString());
    }
}
