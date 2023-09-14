package br.com.neoexpress.usuario;

import java.io.Serializable;

public class Usuario implements Serializable {
      private String nome, dtNasc, cpf, email;
      private int rg, cel;

      public String getNome() {
            return nome;
      }
      protected void setNome(String nome) {
            this.nome = nome;
      }
      protected String getDtNasc() {
            return dtNasc;
      }
      protected void setDtNasc(String dtNasc) {
            this.dtNasc = dtNasc;
      }
      protected String getCpf() {
            return cpf;
      }
      protected void setCpf(String cpf) {
            this.cpf = cpf;
      }
      protected String getEmail() {
            return email;
      }
      protected void setEmail(String email) {
            this.email = email;
      }
      protected int getCel() {
            return cel;
      }
      protected void setCel(int cel) {
            this.cel = cel;
      }
      protected int getRg() {
            return rg;
      }
      protected void setRg(int rg) {
            this.rg = rg;
      }

      public Usuario(String nome, String dtNasc, String cpf, String email, int rg, int cel){
            setNome(nome); setDtNasc(dtNasc); setCpf(cpf); setEmail(email); setRg(rg); setCel(cel);
      }
}
