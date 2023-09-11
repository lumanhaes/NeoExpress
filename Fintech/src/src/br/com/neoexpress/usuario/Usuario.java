package br.com.neoexpress.usuario;

public class Usuario{
      private String nome, dtNasc, cpf, email;
      private int rg, cel;

      public String getNome() {
            return nome;
      }
      private void setNome(String nome) {
            this.nome = nome;
      }
      private String getDtNasc() {
            return dtNasc;
      }
      private void setDtNasc(String dtNasc) {
            this.dtNasc = dtNasc;
      }
      private String getCpf() {
            return cpf;
      }
      private void setCpf(String cpf) {
            this.cpf = cpf;
      }
      private String getEmail() {
            return email;
      }
      private void setEmail(String email) {
            this.email = email;
      }
      private int getCel() {
            return cel;
      }
      private void setCel(int cel) {
            this.cel = cel;
      }
      private int getRg() {
            return rg;
      }
      private void setRg(int rg) {
            this.rg = rg;
      }

      public void cadastrarUsuario(String nome, String dtNasc, String cpf, String email, int rg, int cel){
            setNome(nome); setDtNasc(dtNasc); setCpf(cpf); setEmail(email); setRg(rg); setCel(cel);
      }

      public Usuario(){};
}
