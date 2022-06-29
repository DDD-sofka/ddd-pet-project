package org.example.joyeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;

public class FechaDeUnaFacturaCambiada extends DomainEvent {

    public FechaDeUnaFacturaCambiada() {
        super("joyeria.cliente.fechadeunafacteracambiada");
    }
}
