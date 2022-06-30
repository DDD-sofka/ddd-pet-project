package org.example.joyeria.producto.comandos;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.producto.values.Precio;
import org.example.joyeria.producto.values.ProductoId;

public class CambiarPrecioComando extends Command {
    private final ProductoId productoId;
    private final Precio precio;

    public CambiarPrecioComando(ProductoId productoId, Precio precio) {
        this.productoId = productoId;
        this.precio = precio;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}