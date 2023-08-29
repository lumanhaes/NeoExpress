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
}
