import br.com.neoexpress.usuario.conta.ContaCorrente;
import br.com.neoexpress.usuario.conta.ContaPoupanca;
import br.com.neoexpress.usuario.Usuario;

public class Main {
    public static void main(String[] args) {

        //Usuario
        Usuario Lucas = new Usuario("Lucas", 12345, "27/08/1998", "48030373880", "lucas@outlook.com", 392641421, 916683451);

        //Conta Corrente
        ContaCorrente cc01 = new ContaCorrente(Lucas, 1234, 6548, 150, "CC");

        //Conta Poupança
        ContaPoupanca cp01 = new ContaPoupanca(Lucas, 1234, 6543, 150, "CP");

        //Teste saque de contas
        cc01.sacar(12345, 50);
        cp01.sacar(12345, 50);
        cc01.exibirConta();
        cp01.exibirConta();

        //Teste transfrência de contas
        cc01.transferir(12345, 50, cp01);
        cp01.transferir(12345, 50, cc01);
        cc01.exibirConta();
        cp01.exibirConta();

        //Teste de deposito
        cc01.depositar(50);
        cp01.depositar(50);
        cc01.exibirConta();
        cp01.exibirConta();
    }

}