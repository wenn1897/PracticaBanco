package com.company;

public class CuentaDeAhorro extends Cuenta{

    private double tasaInteresMensual;

    public CuentaDeAhorro(int numero, double saldo, double tasaInteresMensual){
        super(numero, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" + "tasaInteresMensual=" + tasaInteresMensual + '}' + super.toString();
    }

    public double calcularIntereses(){
        return saldo*this.tasaInteresMensual;
    }

}
