
package atividade;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        Motoboy moto = new Motoboy("123", "Johan", "213213812" , "12121281", Genero.MASCULINO, 2500, LocalDate.of(1999, Month.FEBRUARY, 13));
        System.out.println(moto.toString());
        Gerente gere =  new Gerente(Bonificacao.GERENTE, "Claudio", "12345", "123344", Genero.MASCULINO, 3500, LocalDate.of(1995, Month.JANUARY, 24));
        System.out.println(gere.toString());
        Diretor diretor1 = new Diretor("Jessica", "12345", "2367236", Genero.FEMININO, 9870, LocalDate.of(1994, Month.MARCH, 12));
        System.out.println(diretor1.toString());
    }
    
}
