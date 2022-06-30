package org.example.joyeria.producto.comandos;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.producto.values.Precio;
import org.example.joyeria.producto.values.ProductoId;
import org.example.joyeria.producto.values.Stock;

public class CrearProductoComando extends Command {

    private final ProductoId id;
    private final Stock stock;
    private final Precio precio;

    public CrearProductoComando(ProductoId id, Stock stock, Precio precio) {
        this.id = id;
        this.stock = stock;
        this.precio = precio;
    }

    public ProductoId getId() {
        return id;
    }

    public Stock getStock() {
        return stock;
    }

    public Precio getPrecio() {
        return precio;
    }
}
