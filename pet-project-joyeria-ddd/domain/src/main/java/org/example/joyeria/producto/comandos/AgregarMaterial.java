package org.example.joyeria.producto.comandos;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.producto.values.Descripcion;
import org.example.joyeria.producto.values.MaterialId;
import org.example.joyeria.producto.values.ProductoId;
import org.example.joyeria.producto.values.TipoMaterial;

public class AgregarMaterial extends Command {
    private final ProductoId productoId;
    private final MaterialId id;
    private final TipoMaterial tipoMaterial;
    private final Descripcion descripcion;

    public AgregarMaterial(ProductoId productoId, MaterialId id, TipoMaterial tipoMaterial, Descripcion descripcion) {
        this.productoId = productoId;
        this.id = id;
        this.tipoMaterial = tipoMaterial;
        this.descripcion = descripcion;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public MaterialId getId() {
        return id;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
