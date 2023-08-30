package com.neoexpress.conta;
import com.neoexpress.user.User;
import java.util.Calendar;

public class Conta implements java.io.Serializable{
    public static final long serialVersionUID = 2L;
    
//  #ATRIBUTOS
    private int numeroConta;
    private int agencia;
    private double saldo;
    private String dataAbertura;
    private String tipoConta;

//  #METODO - EXIBIR SALDO: APENAS LEITURA
    public double getSaldo(){
        return this.saldo;
    }

//  #METODO - DEPOSITAR: APENAS ALTERAÇÃO
    public void setDepositar(int numeroConta, int agencia, double valor){
        this.saldo = saldo + valor;
    }

//  #METODO - SACAR: APENAS ALTERAÇÃO
    public void setSacar(double valor){
        this.saldo = saldo - valor;
    }

//  #METODO - SACAR: APENAS ALTERAÇÃO COM SOBRECARGA
    public void setSacar(double valor, double taxa){
        this.saldo = saldo - valor - taxa;
    }

//  #CONSTRUTORES
    //Construtor padrão
    public Conta() {}

//  Construtores: construtores auxiliam na criação de objetos, passando parametros que recebem os atributos do objeto
    public Conta(int numeroConta, int agencia, double saldo, String dataAbertura, String tipoConta){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        // this.numeroConta referencia ao atributo numeroConta do objeto conta e não a variavel numeroConta do construtor
    }
}
