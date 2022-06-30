package org.example.joyeria.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.producto.eventos.*;
import org.example.joyeria.producto.values.*;

import java.util.List;
import java.util.Objects;

public class Producto extends AggregateEvent<ProductoId> {
    protected Stock stock;
    protected Precio precio;
    protected Material material;
    protected Proveedor proveedor;

    public Producto(ProductoId id, Stock stock, Precio precio) {
        super(id);
        appendChange(new ProductoCreado(stock, precio)).apply();
    }

    private Producto(ProductoId productoId){
        super(productoId);
        subscribe(new ProductoChange(this));
    }

    public static Producto from(ProductoId productoId, List<DomainEvent> events){
        var producto = new Producto(productoId);
        events.forEach(producto::applyEvent);
        return producto;
    }

    public void agregarMaterial (MaterialId materialId, TipoMaterial tipoMaterial, Descripcion descripcion){
        Objects.requireNonNull(materialId);
        Objects.requireNonNull(tipoMaterial);
        Objects.requireNonNull(descripcion);
        appendChange(new MaterialAgregado(materialId, tipoMaterial, descripcion)).apply();
    }

    public void agregarProveedor (ProveedorId id, Nombre nombre, Direccion direccion){
        Objects.requireNonNull(id);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(direccion);
        appendChange(new ProveedorAgregado(id, nombre, direccion)).apply();
    }

    public void cambiarStock (Stock stock){
        appendChange(new StockCambiado(stock)).apply();
    }

    public void cambiarPrecio (Precio precio){
        appendChange(new PrecioCambiado(precio)).apply();
    }

    public void cambiarTipoDeUnMaterial( MaterialId materialId, TipoMaterial tipoMaterial ) {
        appendChange(new TipoDeMaterialCambiado(materialId, tipoMaterial)).apply();
    }

    public void cambiarDescripcionDeUnMaterial( MaterialId materialId, Descripcion descripcion ) {
        appendChange(new DescripcionDeMaterialCambiado(materialId, descripcion)).apply();
    }

    public void cambiarNombtrDeUnProveedor( ProveedorId ProveedorId, Nombre nombre ) {
        appendChange(new NombreDeProveedorCambiado(ProveedorId, nombre)).apply();
    }

    public void cambiarDireccionDeUnProveedor( ProveedorId ProveedorId, Direccion direccion ) {
        appendChange(new DireccionDeProveedorCambiado(ProveedorId, direccion)).apply();
    }

    public Material material() {
        return material;
    }

    public Precio precio() {
        return precio;
    }

    public Proveedor proveedor() {
        return proveedor;
    }

    public Stock stock() {
        return stock;
    }
}
