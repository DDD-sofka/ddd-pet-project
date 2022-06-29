package org.example.joyeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUnClienteActualizado extends DomainEvent {
    public NombreDeUnClienteActualizado() {
        super("joyeria.cliente.productoasociado");
    }
}
