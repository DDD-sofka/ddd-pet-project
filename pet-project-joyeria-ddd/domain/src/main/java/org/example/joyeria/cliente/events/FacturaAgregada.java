package org.example.joyeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;

public class FacturaAgregada extends DomainEvent {
    public FacturaAgregada() {
        super("joyeria.cliente.facturaagregada");
    }
}
