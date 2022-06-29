package org.example.joyeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.cliente.values.Nombre;
import org.example.joyeria.vendedor.value.VendedorId;

import java.util.UUID;

public class VendedorAsociado extends DomainEvent {

  VendedorId vendedorId;
  Nombre nombre;

  public VendedorAsociado(VendedorId vendedorId, Nombre nombre) {
    super("joyeria.cliente.vendedorasociado");
    this.vendedorId = vendedorId;
    this.nombre = nombre;
  }

  public Nombre getNombre() {
    return nombre;
  }

  public void setNombre(Nombre nombre) {
    this.nombre = nombre;
  }

  public VendedorId getVendedorId() {
    return vendedorId;
  }

  public void setVendedorId(VendedorId vendedorId) {
    this.vendedorId = vendedorId;
  }
}
