package org.example.joyeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ProductoAsociado extends DomainEvent {
    public ProductoAsociado() {
        super("joyeria.cliente.productoasociado");
    }

}
