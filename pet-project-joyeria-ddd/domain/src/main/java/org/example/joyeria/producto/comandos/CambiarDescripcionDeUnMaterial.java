package org.example.joyeria.producto.comandos;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.producto.values.Descripcion;
import org.example.joyeria.producto.values.MaterialId;
import org.example.joyeria.producto.values.ProductoId;

public class CambiarDescripcionDeUnMaterial extends Command {
    private final ProductoId productoId;
    private final MaterialId materialId;
    private final Descripcion descripcion;

    public CambiarDescripcionDeUnMaterial(ProductoId productoId, MaterialId materialId, Descripcion descripcion) {
        this.productoId = productoId;
        this.materialId = materialId;
        this.descripcion = descripcion;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
