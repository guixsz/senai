package atividade1;

import java.time.LocalDate;

public class Cliente extends Fisica{
   private int protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(int protocoloAtendimento, Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadocivil, dataNascimento, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
   
    
}
