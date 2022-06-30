package org.example.joyeria.producto.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.producto.values.Direccion;
import org.example.joyeria.producto.values.ProveedorId;

public class DireccionDeProveedorCambiado extends DomainEvent {
    private final ProveedorId id;
    private final Direccion direccion;

    public DireccionDeProveedorCambiado(ProveedorId id, Direccion direccion) {
        super("sofka.producto.direcciondeproveedorcambiado");
        this.id = id;
        this.direccion = direccion;
    }

    public Direccion direccion() {
        return direccion;
    }

    public ProveedorId id() {
        return id;
    }
}
