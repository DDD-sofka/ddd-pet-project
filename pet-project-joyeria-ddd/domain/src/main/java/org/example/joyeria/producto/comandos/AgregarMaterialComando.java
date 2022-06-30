package org.example.joyeria.producto.comandos;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.producto.values.Descripcion;
import org.example.joyeria.producto.values.MaterialId;
import org.example.joyeria.producto.values.ProductoId;
import org.example.joyeria.producto.values.TipoMaterial;

public class AgregarMaterialComando extends Command {
    private final ProductoId productoId;
    private final MaterialId id;
    private final TipoMaterial tipoMaterial;
    private final Descripcion descripcion;

    public AgregarMaterialComando(ProductoId productoId, MaterialId materialId, TipoMaterial tipoMaterial, Descripcion descripcion) {
        this.productoId = productoId;
        this.id = materialId;
        this.tipoMaterial = tipoMaterial;
        this.descripcion = descripcion;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public MaterialId getMaterialId() {
        return id;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
