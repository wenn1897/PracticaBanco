package com.company.PracticaInterfaces.Interfaces;

import com.company.PracticaInterfaces.Cliente;

import java.util.ArrayList;

public interface ServicioClientes {

    boolean agregarCliente(Cliente cliente);

    boolean eliminarCliente(int numero);

    Cliente consultarCliente(int numero);

    ArrayList<Cliente> obtenerCliente();

    Cliente buscarClienteRFC(String rfc);

}
