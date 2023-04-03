package atividade1;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Advogado adv = new Advogado("123456", "9223823892389", "273672327", "23722332", Setor.JURIDICO, 2500, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(2003, 06, 25), 12345, "Julian Alvarez", "3313-3465", "senai.senai@senai.senai",
                                new Endereco("Rua das alamedas", "890", "20245-456", "Florianópolis", "Em frente a Smart fit", UnidadeFederativa.BAHIA));
    
        System.out.println(adv.toString());
        
        Medico med = new Medico("123456", "9223823892389", "273672327", "23722332", Setor.SAUDE, 5500, Genero.FEMININO, EstadoCivil.DIVORCIADO, LocalDate.of(2001, 10, 13), 12345, "Amanda Bastarda", "3313-3465", "senai.senai@senai.senai",
                                new Endereco("Rua das alamedas", "890", "20245-456", "Goiania", "Em frente a Smart fit", UnidadeFederativa.GOIAS));
        
        System.out.println(med.toString());
        
        Engenheiro eng = new Engenheiro("123456", "9223823892389", "273672327", "23722332", Setor.ENGENHARIA, 3500, Genero.FEMININO, EstadoCivil.SOLTEIRO, LocalDate.of(2000, 11, 8), 12345, "Maria Luiza", "3313-3465", "senai.senai@senai.senai",
                                new Endereco("Rua das alamedas", "890", "20245-456", "Manaus", "Em frente a Smart fit", UnidadeFederativa.AMAZONAS));
        
        System.out.println(eng.toString());
        
        PrestacaoServicos ps = new PrestacaoServicos(LocalDate.MIN, LocalDate.MIN, "1726172", "9213923", 1234567, "Jefferson Caminhões", "3314-9284", "senai@senai",
                                    new Endereco("Rua das areias", "474", "1293-293", "Rio de Janeiro", "Em frente a Brasilgás", UnidadeFederativa.RIO_DE_JANIERO));
        
        System.out.println(ps.toString());
        
        Fornecedor for1 = new Fornecedor("Manteiga", "22327832", "178178", 123456, "Padaria do joe", "3314-9218", "Senai@senai.br",
                                new Endereco("São josé", "83","4783-394", "Madureira", "Em frente ao bar da Helena", UnidadeFederativa.RIO_DE_JANIERO));
        
        System.out.println(for1.toString());
    }
}
 