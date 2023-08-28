package com.neoexpress.conta;
import com.neoexpress.user.User;
import java.util.Calendar;

public class Conta {
    
    // ATRIBUTOS
    public int numeroConta;
    public int agencia;
    public double saldo;
    public Calendar dataAbertura;
    public String tipoConta;
    // ATRIBUTOS DE OUTRA CLASSE
    public User user01 = new User();
}
