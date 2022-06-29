package org.example.joyeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.cliente.values.Nombre;

public class ProductoAsociado extends DomainEvent {
    public ProductoAsociado() {
        super("joyeria.cliente.productoasociado");
    }

}
