package org.example.joyeria.producto.comandos;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.producto.values.ProductoId;
import org.example.joyeria.producto.values.Stock;

public class CambiarStockComando extends Command {

    private final ProductoId productoId;
    private final Stock stock;

    public CambiarStockComando(ProductoId productoId, Stock stock) {
        this.productoId = productoId;
        this.stock = stock;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Stock getStock() {
        return stock;
    }
}
