package com.company.PracticaInterfaces;

public class CuentaDeAhorro extends Cuenta {

    public double tasaInteresMensual;

    public CuentaDeAhorro(int numero, double saldo, double tasaInteresMensual){
        super(numero, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
    }



    /*@Override
    /*public String toString() {
        return "CuentaDeAhorro{" +
            "tasaInteresMensual=" + tasaInteresMensual +
            "} " + super.toString();}*/

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" + "tasaInteresMensual=" + tasaInteresMensual + '}';
    }

}
