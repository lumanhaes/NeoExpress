package br.com.neoexpress.usuario.conta;
import br.com.neoexpress.usuario.Usuario;
import java.io.Serializable;

//  CLASSE ABSTRATA - Não é mais possível instanciar um objeto a partir da classe Conta
public abstract class Conta extends Usuario implements Serializable {
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

    public abstract void exibirConta();

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("\nDeposito concluído");
    }

    public abstract void sacar(int senha, double valor);

    public abstract void transferir(int senha, double valor, Conta contaDestino);

    public Conta(Usuario titular, int agencia, int conta, double saldo){
        setTitular(titular); setAgencia(agencia); this.conta = conta; setSaldo(saldo);
    }
}