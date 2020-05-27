package com.projeto;

public class Gerente extends Funcionario {
    private String login;
    private String senha;
    GerenciarControlePonto gc = new GerenciarControlePonto();

    public String getLogin(String next) {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha(String next) {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void registrar(){
        System.out.print("Insira o Id do Gerente: ");
        setIdFunc(gc.sc.nextInt());

        System.out.print("Insira o Nome do Gerente: ");
        setNome(gc.sc.next());

        System.out.print("Insira o Email do Gerente: ");
        setEmail(gc.sc.next());

        System.out.print("Insira o Documento do Gerente: ");
        setDocumento(gc.sc.next());

        System.out.print("Insira o Login do Gerente: ");
        setLogin(gc.sc.next());

        System.out.print("Insira a Senha do Gerente: ");
        setSenha(gc.sc.next());

        System.out.println();
    }
}
