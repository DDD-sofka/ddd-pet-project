package org.example.joyeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.cliente.values.Nombre;

public class ClienteAgregado extends DomainEvent {

    protected Nombre nombre;
    public ClienteAgregado(Nombre nombre) {
        super("joyeria.cliente.clienteagregado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
