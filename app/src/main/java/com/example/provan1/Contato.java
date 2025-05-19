package com.example.provan1;

public class Contato {
    public String nome, telefone1, telefone2, nascimento, email,
            rua, quadra, lote, bairro, cidade, estado, cep, cpf;

    public Contato(String nome, String telefone1, String telefone2, String nascimento, String email,
                   String rua, String quadra, String lote, String bairro, String cidade,
                   String estado, String cep, String cpf) {
        this.nome = nome;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.nascimento = nascimento;
        this.email = email;
        this.rua = rua;
        this.quadra = quadra;
        this.lote = lote;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome + " - " + telefone1;
    }
}

