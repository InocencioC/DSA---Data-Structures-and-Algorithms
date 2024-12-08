package org.example.LinkedList;

public class Cliente {
private String nome;
private String cpf;

public Cliente(String novoCpf, String novoNome){
    this.cpf = novoCpf;
    this.nome = novoNome;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String toString(){
    return this.nome;
    }
}
