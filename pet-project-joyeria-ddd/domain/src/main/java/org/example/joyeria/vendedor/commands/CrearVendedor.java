package org.example.joyeria.vendedor.commands;

import org.example.joyeria.vendedor.values.Nombre;
import org.example.joyeria.vendedor.values.VendedorId;

public class CrearVendedor {
    private final VendedorId entityId;
    private final Nombre nombre;

    public CrearVendedor(VendedorId entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public VendedorId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
