package org.example.joyeria.producto.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.producto.values.Descripcion;
import org.example.joyeria.producto.values.MaterialId;
import org.example.joyeria.producto.values.TipoMaterial;

public class MaterialAgregado extends DomainEvent {
    private final MaterialId id;
    private final TipoMaterial tipoMaterial;
    private final Descripcion descripcion;

    public MaterialAgregado(MaterialId id, TipoMaterial tipoMaterial, Descripcion descripcion) {
        super("sofka.producto.materialagregado");
        this.id = id;
        this.tipoMaterial = tipoMaterial;
        this.descripcion = descripcion;
    }

    public MaterialId materialId() {
        return id;
    }

    public TipoMaterial tipoMaterial() {
        return tipoMaterial;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
