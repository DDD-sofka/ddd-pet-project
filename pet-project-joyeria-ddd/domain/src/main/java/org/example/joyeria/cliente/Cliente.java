package org.example.joyeria.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.joyeria.cliente.events.*;
import org.example.joyeria.cliente.values.ClienteId;
import org.example.joyeria.cliente.values.Nombre;
import org.example.joyeria.vendedor.Vendedor;
import org.example.joyeria.vendedor.value.VendedorId;

import java.util.Set;

public class Cliente  extends AggregateEvent<ClienteId> {

    protected Nombre nombre;
    protected Clasificacion clasificacion;
    protected Factura factura;
    protected Set<ProductoId> productos ;
    protected VendedorId vendedorId;

    public Cliente(ClienteId entityId, Nombre nombre) {
        super(entityId);
        appendChange(new ClienteAgregado(nombre)).apply();
    }

    public Cliente(ClienteId entityId) {
        super(entityId);
        subscribe(new ClienteChange(this));
    }

    public Nombre nombre() {
        return nombre;
    }

    public void asociarVendedor(VendedorId entityId, Nombre nombre){
        appendChange(new VendedorAsociado(entityId, nombre)).apply();
    }

    public void  asociarProducto(){
        appendChange( new ProductoAsociado()).apply();
    }

    public void actualizarNombreDeUnCliente(Nombre nombre){
        appendChange(new NombreDeUnClienteActualizado()).apply();
        this.nombre = nombre;
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

    public void agregarFactura(Factura factura) {
        appendChange(new FacturaAgregada()).apply();
        this.factura = factura;
    }

    public void cambiarFechaDeUnaFactera(Factura fatura){
        appendChange(new FechaDeUnaFacturaCambiada()).apply();
        this.factura = factura;
    }
/*
    public Set<Producto> productos() {
        return productos;
    }

    public void Prductos(Set<Producto> prductos) {
        this.prductos = prductos;
    }

    public Vendedor getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(Vendedor vendedorId) {
        this.vendedorId = vendedorId;
    }
 */
}