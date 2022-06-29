package org.example.joyeria.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.value.Nombre;
import org.example.joyeria.vendedor.value.VendedorId;

public class VendedorCreado extends DomainEvent {
    public final Nombre nombre;

    public VendedorCreado(VendedorId entityId, Nombre nombre) {
        super("joyeria.vendedor.vendedorcreado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
