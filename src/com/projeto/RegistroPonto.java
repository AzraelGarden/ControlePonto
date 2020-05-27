package com.projeto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private java.time.LocalDate dataRegistro;
    private java.time.LocalDateTime horaEntrada;
    private java.time.LocalDateTime horaSaida;
    GerenciarControlePonto gc = new GerenciarControlePonto();

    public long getIdRegPonto() {
        return idRegPonto;
    }
    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro() {
        this.dataRegistro = LocalDate.now();
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada() {
        this.horaEntrada = LocalDateTime.now();
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida() {
        this.horaSaida = LocalDateTime.now().plusSeconds(1);
    }
    public void registraEntrada(int id, Funcionario func){
        setIdRegPonto(id);
        setFunc(func);
        setDataRegistro();
        setHoraEntrada();
        apresentarPonto(func);
    }
    public void registraSaida(int id, Funcionario func){
        setHoraSaida();
        apresentarPonto(func);
    }

    public void apresentarPonto(Funcionario func){

        System.out.println("=============================================");

        if (func.toString().contains("Gerente")) {
            System.out.println("Funcionário: = Gerente " + func.getNome());
        } else if (func.toString().contains("Secretaria")) {
            System.out.println("Funcionário: = Secretaria " + func.getNome());
        } else if (func.toString().contains("Operador")) {
            System.out.println("Funcionário: = Operador " + func.getNome());
        }

        System.out.println("Data de Registro = " + dataRegistro);
        System.out.println("Horario de Entrada = " + horaEntrada);
        System.out.println("Horario de Saida = " + horaSaida);
    }
}
