package org.example.joyeria.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.joyeria.producto.values.*;

import java.util.Objects;

public class Proveedor extends AggregateEvent<ProveedorId> {

    private Nombre nombre;
    private Direccion direccion;

    public Proveedor(ProveedorId id, Nombre nombre, Direccion direccion) {
        super(id);
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void cambiarDireccion(Direccion direccion){
        this.direccion = Objects.requireNonNull(direccion);
    }

    public void cambiarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Direccion direccion() {
        return direccion;
    }
    
}
