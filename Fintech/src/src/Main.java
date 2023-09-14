import br.com.neoexpress.conta.Conta;
import br.com.neoexpress.conta.ContaCorrente;
import br.com.neoexpress.conta.ContaPoupanca;
import br.com.neoexpress.usuario.Usuario;

public class Main {
    public static void main(String[] args) {

        //Usuario
        Usuario Lucas = new Usuario("Lucas", "27/08/1998", "48030373880", "lucas@outlook.com", 392641421, 916683451);

        //Conta Corrente
        ContaCorrente cc01 = new ContaCorrente(Lucas, 123, 9876, 100, "CC");

        //Conta Poupança
        ContaPoupanca cp01 = new ContaPoupanca(Lucas, 123, 6543, 100, "CP");

        cc01.sacar(10);
        cc01.exibirConta();
    }

}