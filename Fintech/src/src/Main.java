import com.neoexpress.conta.Conta;
import com.neoexpress.user.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        // CRIANDO OBJETO COM CONSTRUTOR
        Conta conta01 = new Conta(271075, 0001, 50.00, "ContaCorrente");

        // ATRIBUTOS DE OUTRA CLASSE INSTANCIADA NA CLASSE CONTA
        conta01.user01.nome = "Lucas Ramos Manhães";
        conta01.user01.cpf = 48030373880L;
        conta01.user01.rg = 392641483;
        conta01.user01.email = "ramosmanhaes@outlook.com";
        conta01.user01.senha = "r1j2n3e4";

        conta01.depositar(271075, 0001, 1500);

        conta01.sacar(1000, 10);
        System.out.println(conta01.saldo);
    }
}