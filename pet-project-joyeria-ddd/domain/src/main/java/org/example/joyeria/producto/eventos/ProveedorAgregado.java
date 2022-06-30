package org.example.joyeria.producto.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.producto.values.Direccion;
import org.example.joyeria.producto.values.Nombre;
import org.example.joyeria.producto.values.ProveedorId;

public class ProveedorAgregado extends DomainEvent {
    private final ProveedorId id;
    private final Nombre nombre;
    private final Direccion direccion;

    public ProveedorAgregado(ProveedorId id, Nombre nombre, Direccion direccion) {
        super("sofka.producto.proveedoragregado");
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public ProveedorId proveedorId() {
        return id;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Direccion direccion() {
        return direccion;
    }

}
