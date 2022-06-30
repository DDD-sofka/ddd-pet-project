package org.example.joyeria.factura;

import co.com.sofka.domain.generic.EventChange;
import org.example.joyeria.factura.events.ClasificacionAgregada;
import org.example.joyeria.factura.events.FacturaAgregada;
import org.example.joyeria.factura.events.FechaDeUnaFacturaCambiada;
import org.example.joyeria.factura.events.TipoDeUnaClasificacionCambiada;
import org.example.joyeria.factura.events.*;

public class ClienteChange extends EventChange {
  public ClienteChange(Factura cliente) {

    apply(
        (ClienteAgregado event) -> {
          cliente.nombre = event.getNombre();
          //            cliente.productos = new HashSet<>();
        });

    apply(
        (VendedorAsociado event) -> {
          cliente.vendedorId = event.getVendedorId();
        });

    apply(
        (ProductoAsociado event) -> {
          //   cliente.productos.add(new Producto(event.getProductoId(), event.getNombre()));
        });

    apply(
        (NombreDeUnClienteActualizado event) -> {
          cliente.nombre = event.getNombre();
        });

    apply((ClasificacionAgregada event) -> {});

    apply((FacturaAgregada event) -> {});

    apply((TipoDeUnaClasificacionCambiada event) -> {});

    apply((FechaDeUnaFacturaCambiada event) -> {});
  }
}
