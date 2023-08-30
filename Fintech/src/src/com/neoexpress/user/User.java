package com.neoexpress.user;
import java.util.Calendar;

// importanto a classe Serialazible, para ter mais segurança transportando bits pela rede
// e requisitando um identificador de serialização, porque podemos ter no mesmo ambiente de memoria
// mais de um objeto da classe user com versões diferentes, então conseguimos identifcar qual que é
// a versão daquele objeto, para que os objetos não se confundam.
public class User implements java.io.Serializable {

//    implementando um serial de versão UID
    public static final long serialVersionUID = 1L;


//  #ENCAPSULAMENTO

//  Encapsulamento: alteramos os atributos para private,nenhum classe externa pode alterar o atributo
//  mas precisamos fazer com que esse atributo seja alterado, mas só com algum metodo dentro da propria classe
//  nisso entra os metodos padrões: obter geters(leitura) | alterar: seters(escrita)

//  ATRIBUTOS
    private String nome;
    private long cpf;
    private int rg;
    private String dataNasc;
    private String email;
    private String senha;

//  METODO GET(obter) : ambos são públicos para serem acessados fora dessa classe
    public String getUser(){
        return "Nome: " + this.nome + "\n" + "E-mail: " + this.email;
    }

//  METODO SET(alterar)
    public void setUser(String nome, String email){ //  obrigatorio receber como parametro qual o novo nome e email que será associado ao atributo
        this.nome = nome; this.email = email;
    }

// CONSTRUTOR
    public User(String nome, long cpf, int rg, String dataNasc, String email, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.senha = senha;
    }
}
