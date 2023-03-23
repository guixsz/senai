package teste;

import java.time.LocalDate;

public class Login_Informatica extends Fornecedor{
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public Login_Informatica() {
    }

    public Login_Informatica(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, int id, String nome, int idade, Genero genero, Endereco endereco, LocalDate dataNascimento) {
        super(cnpj, inscricaoEstadual, id, nome, idade, genero, endereco, dataNascimento);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }
    
    
}
