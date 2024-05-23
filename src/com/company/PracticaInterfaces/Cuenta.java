package com.company.PracticaInterfaces;

public class Cuenta {
    public int numero;
    public String fechaApertura;
    public double saldo;
    public String fechaCancelacion;

    public Cuenta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
        this.fechaApertura = java.time.LocalDate.now().toString();
        this.fechaCancelacion = "0/0/0";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", fechaApertura=" + fechaApertura + ", saldo=" + saldo + ", fechaCancelacion=" + fechaCancelacion + '}';
    }


}
