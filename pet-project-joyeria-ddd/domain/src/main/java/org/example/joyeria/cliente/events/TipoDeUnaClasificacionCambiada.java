package org.example.joyeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;

public class TipoDeUnaClasificacionCambiada extends DomainEvent {

    public TipoDeUnaClasificacionCambiada() {
        super("joyeria.cliente.tipodeunaclasificacioncambiada");
    }
}
