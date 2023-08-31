package br.com.neoexpress.account; import java.io.Serial;

public class Account extends br.com.neoexpress.user.User implements java.io.Serializable{
    @Serial private static final long serialVersionUID = -764822971637782633L;

    //  #ATRIBUTOS
    private int account, agency;
    private double balance, tedRate = 12.36, docRate = 4.48;
    private String accountType, openingDate;

    //  #METODOS
    //  Exibir saldo da conta
    public double getAccount(){ return this.balance;}
    //  Depositar
    public void setDeposit(double valueDeposit){ this.balance += valueDeposit;}
    //  Sacar
    public void setWithdraw(double value){ this.balance -= value;}
    //  Sacar com sobrecarga de taxa
    public void setWIthdraw(double value, double rate){
        this.balance = balance - value - rate;
    }
    //  Tranferir PIX
    public void setTransferPix(int cpf, int numberAccount, int targetAgency,double value){
        this.balance -= value;
    }

    //  Transferir TED
    public void setTransferTed(int numberAccount, int targetAgency, double value){
        this.balance = balance - value - tedRate;
    }
    //  Transferir DOC
    public void setTranferDoc(int numberAccount, int targetAgency, double value){
        this.balance = balance - value - docRate;
    }

    //  #CONSTRUTOR
    public Account(int account, int agency, double balance, String accountType, String openingDate){
        super();
        this.account = account; this.agency = agency; this.balance = balance; this.accountType = accountType;
        this.openingDate = openingDate;
    }
}
