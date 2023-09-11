import br.com.neoexpress.conta.Conta;
import br.com.neoexpress.usuario.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario Lucas = new Usuario();
        Lucas.cadastrarUsuario("Lucas", "27/08/1998", "48030373880", "lucas@outlook.com", 392641421, 916683451);
        Conta cc01 = new Conta();
        cc01.cadastrarConta(Lucas,2563,385178, 50);
        cc01.exibirConta();

        Usuario Fernanda = new Usuario();
        Fernanda.cadastrarUsuario("Fernanda", "11/09/2023", "4803034521", "fernanda@example.com", 392641549, 91664578);
        Conta cc02 = new Conta();
        cc02.cadastrarConta(Fernanda, 2563, 385179, 100);
        cc02.exibirConta();
        cc02.transferir(100, cc01);
        cc02.exibirConta();
        cc01.exibirConta();


    }

}