package org.example.joyeria.producto.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.producto.values.Stock;

public class StockCambiado extends DomainEvent {

    private final Stock stock;
    public StockCambiado(Stock stock) {
        super("sofka.producto.stockcambiado");
        this.stock = stock;
    }

    public Stock stock() {
        return stock;
    }
}
