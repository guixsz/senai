package metodoEstatico;

import java.time.LocalDate;

public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valorContrato;

    public Juridica() {
    }

    public Juridica(String cnpj, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, double valorContrato, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }

    @Override
    public String toString() {
        return "\nNome " + super.nome +
               "\nID: " + super.id +
               "\nTelefone: " + super.telefone +
               "\nLogradouro: " + super.endereco.logradouro +
               "\nNumero: " + super.endereco.numero +
               "\nComplemento: " + super.endereco.complemento +
               "\nCEP: " + super.endereco.cep +
               "\nCidade: " + super.endereco.cidade +
               "\nUF: " + super.endereco.uf +
               "\nCNPJ: " + this.cnpj +
               "\nInscricao estadual: " + this.inscricaoEstadual +
               "\nData de inicio: " + Util.FormatarData(dataInicio) +
               "\nData de termino: " + Util.FormatarData(dataTermino) +
               "\nValor do contrato: " + Util.FormatarMoeda(valorContrato); 
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }
    
    
}
