package atividade1;

import java.time.LocalDate;

public abstract class Fisica extends Pessoa{
    protected Genero genero;
    protected EstadoCivil estadocivil;
    protected LocalDate dataNascimento;

    public Fisica() {
    }

    public Fisica(Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.genero = genero;
        this.estadocivil = estadocivil;
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
}
