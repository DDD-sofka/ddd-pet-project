package org.example.joyeria.producto.comandos;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.producto.values.Direccion;
import org.example.joyeria.producto.values.Nombre;
import org.example.joyeria.producto.values.ProductoId;
import org.example.joyeria.producto.values.ProveedorId;

public class AgregarProveedor extends Command {
    private final ProductoId productoId;
    private final ProveedorId id;
    private final Nombre nombre;
    private final Direccion direccion;

    public AgregarProveedor(ProductoId productoId, ProveedorId id, Nombre nombre, Direccion direccion) {
        this.productoId = productoId;
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public ProveedorId getId() {
        return id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
