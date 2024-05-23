package com.company.PracticaInterfaces;

import java.util.ArrayList;

public class Banco {
    Domicilio domicilio;
    ArrayList<Cliente> clientes;

    private String nombre;
    private String rfc;
    private String telefono;

    public Banco(){
        this.domicilio = domicilio;
        this.clientes = clientes;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
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

    @Override
    public String toString() {
        return "Banco{" + "domicilio=" + domicilio + ", clientes=" + clientes + ", nombre=" + nombre + ", rfc=" + rfc + ", telefono=" + telefono + '}';
    }

    public boolean agregarCliente(Cliente cliente){
        return this.getClientes().add(cliente);
    }





}
