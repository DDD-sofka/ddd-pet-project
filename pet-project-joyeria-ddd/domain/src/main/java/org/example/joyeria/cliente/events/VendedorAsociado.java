package org.example.joyeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.cliente.values.Nombre;

import java.util.UUID;

public class VendedorAsociado extends DomainEvent {

    VendedorId vendedorId;
    public VendedorAsociado(VendedorId vendedorId) {
        super("joyeria.cliente.vendedorasociado");
        this.vendedorId = vendedorId;

    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(VendedorId vendedorId) {
        this.vendedorId = vendedorId;
    }
}
