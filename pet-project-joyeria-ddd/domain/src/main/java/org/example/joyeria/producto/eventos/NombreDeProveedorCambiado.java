package org.example.joyeria.producto.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.producto.values.Nombre;
import org.example.joyeria.producto.values.ProveedorId;

public class NombreDeProveedorCambiado extends DomainEvent {
    private final ProveedorId id;
    private final Nombre nombre;

    public NombreDeProveedorCambiado(ProveedorId id, Nombre nombre) {
        super("sofka.producto.nombredeproveedorcambiado");
        this.id = id;
        this.nombre = nombre;
    }

    public Nombre nombre() {
        return nombre;
    }

    public ProveedorId id() {
        return id;
    }
}
