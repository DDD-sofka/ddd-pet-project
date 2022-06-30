package org.example.joyeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.cliente.values.NombreCliente;

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
