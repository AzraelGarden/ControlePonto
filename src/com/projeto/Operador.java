package com.projeto;

public class Operador extends Funcionario {
    private double valorHora;
    GerenciarControlePonto gc = new GerenciarControlePonto();

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void registrar(){
        System.out.print("Insira o Id do Operador: ");
        setIdFunc(gc.sc.nextInt());

        System.out.print("Insira o Nome do Operador: ");
        setNome(gc.sc.next());

        System.out.print("Insira o Email do Operador: ");
        setEmail(gc.sc.next());

        System.out.print("Insira o Documento do Operador: ");
        setDocumento(gc.sc.next());

        System.out.print("Insira o Valor da Hora do Operador: ");
        setValorHora(gc.sc.nextDouble());

        System.out.println();
    }
}
