package com.company;

import java.util.ArrayList;

public class Cliente {
    Domicilio domicilio;
    ArrayList<Cuenta> cuentas;

    private int numero;
    private String nombre;
    private String rfc;
    private String telefono;
    private String fechaNacimiento;

    public Cliente( Domicilio domicilio, ArrayList<Cuenta> cuentas, int numero, String nombre, String rfc, String telefono, String fechaNacimiento){
        this.domicilio = domicilio;
        this.cuentas = cuentas;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.numero = numero;
        this.rfc = rfc;
        this.telefono = telefono;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "domicilio=" + domicilio + ", cuentas=" + cuentas + ", numero=" + numero + ", nombre=" + nombre + ", rfc=" + rfc + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    //Metodos
    public boolean crearCuenta(Cuenta cuenta){
        return this.getCuentas().add(cuenta);
    }



}
