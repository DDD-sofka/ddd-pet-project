package org.example.joyeria.cliente;

import co.com.sofka.domain.generic.EventChange;
import org.example.joyeria.cliente.events.*;

import java.util.HashSet;

public class ClienteChange extends EventChange {
  public ClienteChange(Cliente cliente) {

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
