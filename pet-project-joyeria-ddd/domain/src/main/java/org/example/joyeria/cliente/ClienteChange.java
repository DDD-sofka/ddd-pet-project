package org.example.joyeria.cliente;

import co.com.sofka.domain.generic.EventChange;
import org.example.joyeria.cliente.events.ClienteAgregado;
import org.example.joyeria.cliente.events.VendedorAsociado;

import java.util.HashSet;

public class ClienteChange extends EventChange {
    public ClienteChange(Cliente cliente) {

        apply((ClienteAgregado event) -> {
            cliente.nombre = event.getNombre();
            cliente.productos = new HashSet<>();
        });

        apply((VendedorAsociado event)-> {
            //cliente.vendedorId = event.getVendedorId();
        });


    }
}
