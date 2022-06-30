package org.example.joyeria.producto.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.producto.values.MaterialId;
import org.example.joyeria.producto.values.TipoMaterial;

public class TipoDeMaterialCambiado extends DomainEvent {

    private final MaterialId id;
    private final TipoMaterial tipoMaterial;

    public TipoDeMaterialCambiado(MaterialId id, TipoMaterial tipoMaterial) {
        super("sofka.producto.tipodematerialcambiado");
        this.id = id;
        this.tipoMaterial = tipoMaterial;
    }

    public MaterialId id() {
        return id;
    }

    public TipoMaterial tipoMaterial() {
        return tipoMaterial;
    }
}
