package org.example.joyeria.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.factura.values.NombreCliente;

public class ClienteAgregado extends DomainEvent {

    protected NombreCliente nombre;
    public ClienteAgregado(NombreCliente nombre) {
        super("joyeria.cliente.clienteagregado");
        this.nombre = nombre;
    }

    public NombreCliente getNombre() {
        return nombre;
    }

    public void setNombre(NombreCliente nombre) {
        this.nombre = nombre;
    }
}
