package com.neoexpress.conta;
import com.neoexpress.user.User;
import java.util.Calendar;

public class Conta {
    
//  #ATRIBUTOS
    public int numeroConta;
    public int agencia;
    public double saldo;
    public Calendar dataAbertura;
    public String tipoConta;



//  #METODO
    public double exibirSaldo(){
        return saldo;
    }
//  #METODO COM PARAMETRO
    public void depositar(int numeroConta, int agencia, double valor){
         this.saldo = saldo + valor;
    }

//  #SOBRECARGA DE METODO
//  sobrecarga: permite mais de um comportamento para aquele objeto
//  sem sobrecarga
    public void sacar(double valor){
         saldo = saldo - valor;
    }

//  com sobrecarga
    public void sacar(double valor, double taxa){
         this.saldo = saldo - valor - taxa;
    }

//  #CONSTRUTORES
    //Construtor padrão
    public Conta() {}

//  Construtores: construtores auxiliam na criação de objetos, passando parametros que recebem os atributos do objeto
    public Conta(int numeroConta, int agencia, double saldo, String tipoConta){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        // this.numeroConta referencia ao atributo numeroConta do objeto conta e não a variavel numeroConta do construtor
    }
}
