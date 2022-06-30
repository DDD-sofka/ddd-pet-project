package org.example.joyeria.producto.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.producto.values.Descripcion;
import org.example.joyeria.producto.values.MaterialId;

public class DescripcionDeMaterialCambiado extends DomainEvent {
    private final MaterialId id;
    private final Descripcion descripcion;

    public DescripcionDeMaterialCambiado(MaterialId id, Descripcion descripcion) {
        super("sofka.producto.descripciondematerialcambiado");
        this.id = id;
        this.descripcion = descripcion;
    }

    public MaterialId id() {
        return id;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
