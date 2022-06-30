package org.example.joyeria.producto.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.producto.values.Precio;

public class PrecioCambiado extends DomainEvent {

    private final Precio precio;
    public PrecioCambiado(Precio precio) {
        super("sofka.producto.preciocambiado");
        this.precio = precio;
    }

    public Precio precio() {
        return precio;
    }
}
