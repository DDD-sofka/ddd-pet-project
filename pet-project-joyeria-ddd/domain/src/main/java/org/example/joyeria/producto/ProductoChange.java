package org.example.joyeria.producto;

import co.com.sofka.domain.generic.EventChange;
import org.example.joyeria.producto.eventos.*;

public class ProductoChange extends EventChange {
    public ProductoChange(Producto producto) {

        apply((ProductoCreado event)->{
            producto.stock = event.stock();
            producto.precio = event.precio();
        });

        apply((ProveedorAgregado event) -> {
            producto.proveedor = new Proveedor(event.proveedorId(), event.nombre(), event.direccion());
        });

        apply((MaterialAgregado event) -> {
            producto.material = new Material(event.materialId(), event.tipoMaterial(), event.descripcion());
        });

        apply((StockCambiado event) ->{
            producto.stock = event.stock();
        });

        apply((PrecioCambiado event) ->{
            producto.precio = event.precio();
        });

        apply((TipoDeMaterialCambiado event) -> {
            producto.material.cambiarTipoMaterial(event.tipoMaterial());
        });

        apply((DescripcionDeMaterialCambiado event) -> {
            producto.material.cambiarDescripcion(event.descripcion());
        });

        apply((NombreDeProveedorCambiado event) -> {
            producto.proveedor.cambiarNombre(event.nombre());
        });

        apply((DireccionDeProveedorCambiado event) -> {
            producto.proveedor.cambiarDireccion(event.direccion());
        });

    }

}
