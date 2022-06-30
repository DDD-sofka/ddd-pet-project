package org.example.joyeria.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.value.AreaId;
import org.example.joyeria.vendedor.value.Nombre;

public class NombreDeUnAreaCambiado extends DomainEvent {
    public final Nombre nombre;

    public NombreDeUnAreaCambiado(AreaId entityId, Nombre nombre) {
        super("joyeria.area.nombredeunareacambiado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
