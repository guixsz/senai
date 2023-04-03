package atividade1;

public class Fornecedor extends Juridica{
    private String produto;

    public Fornecedor() {
    }

    public Fornecedor(String produto, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
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
                "\nProduto: " + this.produto;
    }
}
