package br.com.neoexpress.user; import java.io.Serial;

//  #SERIALAZIABLE
// importanto a classe Serialazible, para ter mais segurança transportando bits pela rede
// e requisitando um identificador de serialização, porque podemos ter no mesmo ambiente de memoria
// mais de um objeto da classe user com versões diferentes, então conseguimos identifcar qual que é
// a versão daquele objeto, para que os objetos não se confundam.
public class User implements java.io.Serializable {

//    implementando um serial de versão UID
      @Serial private static final long serialVersionUID = 1098950499297093201L;

//  #ATRIBUTOS
    private String name, birthDate, nationality, maritalStatus, email, address, neighborhood, city, publicPlace, proofResidence, accountType, actualJob;
    private int rg, cnh, etitulo, passport, cell, tel;
    private byte cep, houseNumber;
    private double income;
    private char sex;
    private long cpf;

//  #METODOS
//  Exibir usuário
    public String getUser(){
        return name + email;
    }

//  #CONTRUTOR
    public User() {}

    public User( String name, String birthDate, String nationality, String maritalStatus, String email, String accountType, String address, String neighborhood, String city, String actualJob){
        this.name = name; this.birthDate = birthDate; this.nationality = nationality; this.maritalStatus = maritalStatus; this.email = email; this.accountType = accountType;
        this.address = address; this.neighborhood = neighborhood; this.city = city; this.actualJob = actualJob;
    }

    public User( String name, String birthDate){
        this.name = name; this.birthDate = birthDate; this.nationality = nationality; this.maritalStatus = maritalStatus; this.email = email;
        this.address = address; this.neighborhood = neighborhood; this.city = city; this.actualJob = actualJob;
        this.rg = rg; this.cnh = cnh; this.etitulo = etitulo; this.passport = passport; this.cell = cell; this.tel = tel;
    }

}
