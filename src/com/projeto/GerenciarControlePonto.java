package com.projeto;

import java.util.Scanner;

public class GerenciarControlePonto {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GerenciarControlePonto gc = new GerenciarControlePonto();

        Gerente gerente1 = new Gerente();
        gerente1.registrar();

        Secretaria secretaria1 = new Secretaria();
        secretaria1.registrar();

        Operador operador1 = new Operador();
        operador1.registrar();

        RegistroPonto ponto1 = new RegistroPonto();
        ponto1.registraEntrada(gerente1.getIdFunc(), gerente1);

        RegistroPonto ponto2 = new RegistroPonto();
        ponto2.registraEntrada(operador1.getIdFunc(), operador1);

        RegistroPonto ponto3 = new RegistroPonto();
        ponto3.registraEntrada(secretaria1.getIdFunc(), secretaria1);

        ponto1.registraSaida(gerente1.getIdFunc(), gerente1);
    }
}
