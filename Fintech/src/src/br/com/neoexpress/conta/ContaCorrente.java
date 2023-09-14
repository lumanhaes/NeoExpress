package br.com.neoexpress.conta;
import br.com.neoexpress.usuario.Usuario;
import java.io.Serializable;

public class ContaCorrente extends Conta implements Serializable {

    private String tipoConta = "CC";
    private double taxaCC = 2.20;

    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

//  @OVERRIDE - Sobreescreve os metodos já existentes da superclasse
    @Override
    public void exibirConta(){
        System.out.println("\nTitular: " + super.getTitular().getNome() + "\nAgencia: " + getAgencia() + "\nConta: " + getConta() + "\nSaldo: " + getSaldo() + "\nTipo conta: " + getTipoConta());
    }

    @Override
    public void sacar(double valor){
        if(super.getSaldo() < valor){
            System.out.println("\nSaldo insuficiente"); ;
        }
        else{
            super.setSaldo(getSaldo() - valor - taxaCC);
            System.out.println("\nSaque realizado");
        }
    }

//  CONSTRUTOR - Usando o construtor especifico da superclasse
    public ContaCorrente(Usuario titular, int agencia, int conta, double saldo, String tipoConta){
        super(titular, agencia, conta, saldo);
        this.tipoConta = tipoConta;
    }
}
