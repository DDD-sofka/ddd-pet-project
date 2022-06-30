package org.example.joyeria.producto.comandos;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.producto.values.MaterialId;
import org.example.joyeria.producto.values.ProductoId;
import org.example.joyeria.producto.values.TipoMaterial;

public class CambiarTipoDeUnMaterial extends Command {

    private final ProductoId productoId;
    private final MaterialId materialId;
    private final TipoMaterial tipoMaterial;

    public CambiarTipoDeUnMaterial(ProductoId productoId, MaterialId materialId, TipoMaterial tipoMaterial) {
        this.productoId = productoId;
        this.materialId = materialId;
        this.tipoMaterial = tipoMaterial;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }
}
