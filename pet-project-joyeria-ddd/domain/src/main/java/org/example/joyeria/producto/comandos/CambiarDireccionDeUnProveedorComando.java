package org.example.joyeria.producto.comandos;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.producto.values.Direccion;
import org.example.joyeria.producto.values.ProductoId;
import org.example.joyeria.producto.values.ProveedorId;

public class CambiarDireccionDeUnProveedorComando extends Command {

    private final ProductoId productoId;
    private final ProveedorId proveedorId;
    private final Direccion direccion;

    public CambiarDireccionDeUnProveedorComando(ProductoId productoId, ProveedorId proveedorId, Direccion direccion) {
        this.productoId = productoId;
        this.proveedorId = proveedorId;
        this.direccion = direccion;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public ProveedorId getProveedorId() {
        return proveedorId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
