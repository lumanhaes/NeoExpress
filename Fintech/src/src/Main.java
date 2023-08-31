//  #HERANÇA
//  Na herança temos uma superclasse ou classe pai
//  as classes filhas ou subclasses irão herdar atributos e metodos da superclasse
//  Na herança reaproveitamos o codigo da superclasse e colocamos caracteristicas
//  que são especificas da subclasse, nao pode existir heranças multiplas de superclasses.
//  Toda e qualquer classe herda da superclasse object

import br.com.neoexpress.account.Account;
import br.com.neoexpress.user.User;

public class Main {
    public static void main(String[] args) {

        // OBJETO
        // Adicionando um objeto do tipo conta;
        Account account001 = new Account(248756, 0001, 50.00, "cc", "31/08/2023");


        //  METODO

        // Tranferir doc
        account001.setTranferDoc(4578, 0001, 10);
        System.out.println(account001.getAccount());


    }
}