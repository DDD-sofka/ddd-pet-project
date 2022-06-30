package org.example.joyeria.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.cliente.events.*;
import org.example.joyeria.cliente.values.FacturaId;
import org.example.joyeria.cliente.values.Fecha;
import org.example.joyeria.cliente.values.NombreCliente;
import org.example.joyeria.producto.values.ProductoId;
import org.example.joyeria.vendedor.value.VendedorId;

import java.util.List;
import java.util.Set;

public class Factura extends AggregateEvent<FacturaId> {

    protected NombreCliente nombre;
    protected Clasificacion clasificacion;

    protected Set<ProductoId> productos ;
    protected VendedorId vendedorId;

    public Factura(FacturaId entityId, NombreCliente nombre) {
        super(entityId);
        appendChange(new FacturaAgregada()).apply();
        appendChange(new ClienteAgregado(nombre)).apply();
    }

    public Factura(FacturaId entityId) {
        super(entityId);
        subscribe(new ClienteChange(this));
    }

    public static Factura from(FacturaId facturaId, List<DomainEvent> events){
        var factura = new Factura(facturaId);
        events.forEach(factura::applyEvent);
        return factura;
    }

   /*public void agregarFactura(Factura factura) {
        appendChange(new FacturaAgregada()).apply();
        this.factura = factura;
    }*/

    public void agregarCliente(NombreCliente nobre){
        appendChange(new ClienteAgregado(nombre)).apply();
    }

    public void asociarVendedor(VendedorId entityId, NombreCliente nombre){
        appendChange(new VendedorAsociado(entityId, nombre)).apply();
    }

    public void  asociarProducto(){
        appendChange( new ProductoAsociado()).apply();
    }

    public void actualizarNombreDeUnCliente(NombreCliente nombre){
        appendChange(new NombreDeUnClienteActualizado(nombre)).apply();
    }

    public void agregarClasificacion(Clasificacion clasificacion) {
        appendChange(new ClasificacionAgregada()).apply();
    }

    public Clasificacion clasificacion() {
        return clasificacion;
    }

    public void cambiarTipoDeUnaClasificacion(Clasificacion clasificacion){
        appendChange(new TipoDeUnaClasificacionCambiada()).apply();
        this.clasificacion = clasificacion;
    }

    public void cambiarFechaDeUnaFactura(Fecha fecha){
        appendChange(new FechaDeUnaFacturaCambiada(fecha)).apply();
    }

    public Set<ProductoId> productos() {
        return this.productos;
    }

    public void Prductos(Set<ProductoId> productos) {
        this.productos = productos;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(VendedorId vendedorId) {
        this.vendedorId = vendedorId;
    }
}