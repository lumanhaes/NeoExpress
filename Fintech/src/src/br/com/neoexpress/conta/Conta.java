package br.com.neoexpress.conta;
import br.com.neoexpress.usuario.Usuario;

public class Conta{
    private Usuario titular;
    private int agencia, conta;
    private double saldo;


    private Usuario getTitular() {
        return titular;
    }
    private void setTitular(Usuario titular) {
        this.titular = titular;
    }
    private int getAgencia() {
        return agencia;
    }
    private void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    private double getSaldo() {
        return saldo;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirConta(){
        System.out.println("\nTitular: " + titular.getNome() + "\nAgencia: " + agencia + "\nConta: " + conta + "\nSaldo: " + saldo);
    }

    public void cadastrarConta(Usuario titular, int agencia, int conta, double saldo){
        setTitular(titular); setAgencia(agencia); this.conta = conta; setSaldo(saldo);
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
}