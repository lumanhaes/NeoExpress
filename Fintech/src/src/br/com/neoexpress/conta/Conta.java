package br.com.neoexpress.conta;
import br.com.neoexpress.usuario.Usuario;
import java.io.Serializable;

public class Conta implements Serializable {
    private Usuario titular;
    private int agencia, conta;
    private double saldo = 0;

    protected Usuario getTitular() {
        return titular;
    }
    protected void setTitular(Usuario titular) {
        this.titular = titular;
    }
    protected int getAgencia() {
        return agencia;
    }
    protected void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    protected int getConta() {
        return conta;
    }
    protected void setConta(int conta) {
        this.conta = conta;
    }
    protected double getSaldo() {
        return saldo;
    }
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirConta(){
        System.out.println("\nTitular: " + titular.getNome() + "\nAgencia: " + agencia + "\nConta: " + conta + "\nSaldo: " + saldo);
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("\nSaldo insuficiente"); ;
        }
        else{
            this.saldo -= valor;
            System.out.println("\nSaque realizado");
        }
    }
    public void transferir(double valor, Conta contaDestino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("\nTrânsferência realizada");
        }else{
            System.out.println("\nSaldo insuficiente");
        }
    }

    public Conta(){}
    public Conta(Usuario titular, int agencia, int conta, double saldo){
        setTitular(titular); setAgencia(agencia); this.conta = conta; setSaldo(saldo);
    }
}