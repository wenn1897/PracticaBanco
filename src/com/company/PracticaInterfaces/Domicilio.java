package com.company.PracticaInterfaces;

public class Domicilio {

    public String calle;
    public int numero;
    public String colonia;
    public String estado;
    public String codigoPostal;

    public Domicilio(String calle, int numero, String colonia, String estado, String codigoPostal){
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getColonia() {
        return colonia;
    }

    public String getEstado() {
        return estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", colonia='" + colonia + '\'' +
                ", estado='" + estado + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }
}
