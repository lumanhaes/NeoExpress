package br.com.neoexpress.usuario.conta;
import br.com.neoexpress.usuario.Usuario;
import java.io.Serializable;

public class ContaPoupanca extends Conta implements Serializable {

    private String tipoConta = "CP";
    private double taxaTransferencia = 4.32;

    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public void exibirConta(){
        System.out.println("\nTitular: " + super.getTitular().getNome() + "\nAgencia: " + getAgencia() + "\nConta: " + getConta() + "\nSaldo: " + getSaldo() + "\nTipo conta: " + getTipoConta());
    }

    @Override
    public void sacar(int senha, double valor){
        boolean autenticado = super.getTitular().autenticacao(senha);
        if(autenticado && super.getSaldo() > valor){
            super.setSaldo(getSaldo() - valor);
            System.out.println("\nSaque realizado");
        }
        else if(!autenticado){
            System.out.println("\nSenha incorreta");
        }
        else{
            System.out.println("\nSaldo insuficiente");
        }
    }

    @Override
    public void transferir(int senha, double valor, Conta contaDestino) {
        boolean autenticou = getTitular().autenticacao(senha);
        if(autenticou && super.getSaldo() > valor){
            super.setSaldo(getSaldo() - valor - taxaTransferencia);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println("\nTranferência realizada");
        }
        else if(!autenticou){
            System.out.println("\nSenha incorreta");
        }
        else{
            System.out.println("\nSaldo insuficiente");
        }
    }

    //  CONSTRUTOR - Usando o construtor especifico da superclasse
    public ContaPoupanca(Usuario titular, int agencia, int conta, double saldo,String tipoConta){
        super(titular, agencia, conta, saldo);
        this.tipoConta = tipoConta;
    }
}
