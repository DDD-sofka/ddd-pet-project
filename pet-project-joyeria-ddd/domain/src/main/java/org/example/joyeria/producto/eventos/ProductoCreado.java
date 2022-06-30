package org.example.joyeria.producto.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.producto.Material;
import org.example.joyeria.producto.Proveedor;
import org.example.joyeria.producto.values.Nombre;
import org.example.joyeria.producto.values.Precio;
import org.example.joyeria.producto.values.Stock;

public class ProductoCreado extends DomainEvent {

    private final Stock stock;
    private final Precio precio;

    public ProductoCreado(Stock stock, Precio precio) {
        super("sofka.producto.productocreado");
        this.stock = stock;
        this.precio = precio;
    }

    public Stock stock() {
        return stock;
    }

    public Precio precio() {
        return precio;
    }
}
