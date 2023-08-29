package com.neoexpress.user;
import java.util.Calendar;

public class User {

//  ATRIBUTOS
    public String nome;
    public long cpf;
    public int rg;
    public Calendar dataNasc;
    public String email;
    public String senha;

// METODOS
    public String exibirUsuario(){
        return "Nome: " + nome + "\nE-Mail: " + email;
    }

// CONSTRUTOR
    public User(String nome, long cpf, int rg, String email, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.senha = senha;
    }
}
