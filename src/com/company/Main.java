package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        //add cliente 1
        Cliente brayan;
        ArrayList<Cuenta> cuentasBrayan = new ArrayList<Cuenta>();

        Domicilio domicilioBrayan = new Domicilio("Calle", 52, "Jerusalen", "Bogota", "110282");
        Cuenta cuenta1 = new CuentaDeAhorro(123456, 500000.00, 2.7);
        Cuenta cuenta2 = new CuentaDeCheque(678945, 950000.00, 5000.00);
        cuentasBrayan.add(cuenta1);
        cuentasBrayan.add(cuenta2);
        brayan = new Cliente(domicilioBrayan, cuentasBrayan,1, "Brayan Herrera", "4567", "3025233293", "01/11/94");

        boolean brayanAdd = false;
        System.out.println(brayan);
        brayanAdd = banco.agregarCliente(brayan);

        if(brayanAdd){
            System.out.println("Cliente agregado");
        }

        //add cliente 2
        Cliente camilo;
        ArrayList<Cuenta> cuentasCamilo = new ArrayList<Cuenta>();
        Domicilio domicilioCamilo = new Domicilio("Calle", 46, "Catalina", "Bogota", "110202");
        Cuenta cuenta3 = new CuentaDeAhorro(123400, 380000.00, 1.8);
        Cuenta cuenta4 = new CuentaDeCheque(123559, 5860000.00, 12000.00);
        cuentasCamilo.add(cuenta3);
        cuentasCamilo.add(cuenta4);
        camilo = new Cliente(domicilioCamilo, cuentasCamilo,2, "Camilo Misse", "9632", "3059466044", "18/04/97");

        System.out.println(camilo);

        boolean camiloAdd = false;
        camiloAdd = banco.agregarCliente(camilo);

        if(camiloAdd){
            System.out.println("Cliente agregado");
        }


        //System.out.println(success);
    }
}
