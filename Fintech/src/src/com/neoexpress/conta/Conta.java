package com.neoexpress.conta;
import com.neoexpress.user.User;
import java.util.Calendar;

public class Conta {
    
//      ATRIBUTOS
    public int numeroConta;
    public int agencia;
    public double saldo;
    public Calendar dataAbertura;
    public String tipoConta;

    // OBJETO COM ATRIBUTOS DE OUTRA CLASSE
    public User user01 = new User();

//        METODO
     public double exibirSaldo(){
        return saldo;
    }
//        METODO COM PARAMETRO
    public void depositar(int numeroConta, int agencia, double valor){
         saldo = saldo + valor;
    }

//       SOBRECARGA DE METODO
//  sobrecarga: permite mais de um comportamento para aquele objeto
//  sem sobrecarga
    public void sacar(double valor){
         saldo = saldo - valor;
    }

//  com sobrecarga
    public void sacar(double valor, double taxa){
         this.saldo = saldo - valor - taxa;       // this.saldo referencia ao atributo saldo do objeto conta e não a variavel do metodo
    }
}
