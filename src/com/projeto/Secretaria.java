package com.projeto;

public class Secretaria extends Funcionario {
    private String telefone;
    private String ramal;
    GerenciarControlePonto gc = new GerenciarControlePonto();

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public void registrar(){
        System.out.print("Insira o Id da Secretaria: ");
        setIdFunc(gc.sc.nextInt());

        System.out.print("Insira o Nome da Secretaria: ");
        setNome(gc.sc.next());

        System.out.print("Insira o Email da Secretaria: ");
        setEmail(gc.sc.next());

        System.out.print("Insira o Documento da Secretaria: ");
        setDocumento(gc.sc.next());

        System.out.print("Insira o Telefone da Secretaria: ");
        setTelefone(gc.sc.next());

        System.out.print("Insira o Ramal da Secretaria: ");
        setRamal(gc.sc.next());

        System.out.println();
    }
}
