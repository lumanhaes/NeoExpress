import com.neoexpress.conta.Conta;
import com.neoexpress.user.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        // OBJETO
        Conta conta01 = new Conta();

        // ATRIBUTOS
        conta01.numeroConta = 271075;
        conta01.agencia = 0001;
        conta01.tipoConta = "ContaCorrente";
        conta01.saldo = 50.00;

        // ATRIBUTOS DE OUTRA CLASSE INSTANCIADA NA CLASSE CONTA
        conta01.user01.nome = "Lucas Ramos Manhães";
        conta01.user01.cpf = 48030373880L;
        conta01.user01.rg = 392641483;
        conta01.user01.email = "ramosmanhaes@outlook.com";
        conta01.user01.senha = "r1j2n3e4";

        conta01.depositar(271075, 0001, 1500);
        System.out.println(conta01.saldo);
    }
}