package org.example.joyeria.vendedor;

import co.com.sofka.domain.generic.Entity;
import org.example.joyeria.vendedor.value.AreaId;
import org.example.joyeria.vendedor.value.Nombre;

import java.util.Objects;

public class Area extends Entity<AreaId> {
    private Nombre nombre;

    public Area(AreaId entityId, Nombre nombre) {
        super(entityId);

        this.nombre = nombre;
    }

    public void cambiarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Nombre Nombre() {
        return nombre;
    }
}
