package org.example.joyeria.producto.comandos;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.producto.values.Nombre;
import org.example.joyeria.producto.values.ProductoId;
import org.example.joyeria.producto.values.ProveedorId;

public class CambiarNombtrDeUnProveedor extends Command {

    private final ProductoId productoId;
    private final ProveedorId proveedorId;
    private final Nombre nombre;

    public CambiarNombtrDeUnProveedor(ProductoId productoId, ProveedorId ProveedorId, Nombre nombre ) {
        this.productoId = productoId;
        proveedorId = ProveedorId;
        this.nombre = nombre;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public ProveedorId getProveedorId() {
        return proveedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
