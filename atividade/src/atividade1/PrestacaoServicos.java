package atividade1;

import java.time.LocalDate;

public class PrestacaoServicos extends Juridica{
     private LocalDate contratoInicio;
     private LocalDate contratoFim;

    public PrestacaoServicos() {
    }

    public PrestacaoServicos(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
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

    @Override
    public String toString() {
        return "\nNome: " + super.nome +
                "\nId: " + super.id +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\nLogradouro: " + super.endereco.logradouro +
                "\nNumero: " + super.endereco.numero +
                "\nComplemento: " + super.endereco.complemento +
                "\nCEP: " + super.endereco.complemento +
                "\nCidade: " + super.endereco.cidade +
                "\nUF: " + super.endereco.uf +
                "\nCNPJ: " + super.cnpj +
                "\nIncscricao Estadual: " + super.inscricaoEstadual +
                "\nInicio de contrato: " + this.contratoInicio +
                "\nFim do contrato: " + this.contratoFim;
    }

   
}
