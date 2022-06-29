package org.example.joyeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.cliente.values.Nombre;

public class NombreDeUnClienteActualizado extends DomainEvent {

    protected Nombre nombre;
    public NombreDeUnClienteActualizado(Nombre nombre) {
        super("joyeria.cliente.productoasociado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
