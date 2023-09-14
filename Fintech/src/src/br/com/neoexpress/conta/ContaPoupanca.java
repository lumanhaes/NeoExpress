package br.com.neoexpress.conta;
import br.com.neoexpress.usuario.Usuario;
import java.io.Serializable;

public class ContaPoupanca extends Conta implements Serializable {

    private String tipoConta = "CP";

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

    //  CONSTRUTOR - Usando o construtor especifico da superclasse
    public ContaPoupanca(Usuario titular, int agencia, int conta, double saldo,String tipoConta){
        super(titular, agencia, conta, saldo);
        this.tipoConta = tipoConta;
    }
}
