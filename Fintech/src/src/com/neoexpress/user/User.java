package com.neoexpress.user;
import com.neoexpress.conta.Conta;
import java.util.Calendar;

public class User {

//  ATRIBUTOS
    public String nome;
    public long cpf;
    public int rg;
    public Calendar dataNasc;
    public String email;
    public String senha;

// CONSTRUTOR
    public User(String nome, long cpf, int rg, String email, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.senha = senha;
    }
}
