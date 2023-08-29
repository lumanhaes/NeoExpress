import com.neoexpress.conta.Conta;
import com.neoexpress.user.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        // #CRIANDO OBJETO CONTA MAS AGORA COM CONSTRUTOR
        Conta cc271075 = new Conta(271075, 0001, 50.00, "ContaCorrente");

        // #CRIANDO OBJETO USER MAS AGORA COM CONSTRUTOR
        User user01 = new User("Lucas Manhães", 48030373880L, 392641483, "ramosmanhaes@outlook.com", "r1j2n3e4");

        // #CRIANDO OBJETO USER MAS AGORA COM CONSTRUTOR
        cc271075.depositar(271075, 0001, 1500.35);

        cc271075.sacar(1000, 10.14);
        System.out.println(cc271075.exibirSaldo());

        System.out.println(user01.exibirUsuario());
    }
}