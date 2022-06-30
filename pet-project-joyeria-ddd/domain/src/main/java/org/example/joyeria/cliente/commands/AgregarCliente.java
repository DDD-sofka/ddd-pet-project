package org.example.joyeria.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.cliente.events.ClienteAgregado;
import org.example.joyeria.cliente.values.ClienteId;
import org.example.joyeria.cliente.values.FacturaId;
import org.example.joyeria.cliente.values.NombreCliente;

public class AgregarCliente extends Command {

  private final FacturaId facturaId;
  private final ClienteId clienteId;
  private final NombreCliente nombreCliente;

  public AgregarCliente(FacturaId facturaId, ClienteId clienteId, NombreCliente nombreCliente) {
    this.facturaId = facturaId;
    this.clienteId = clienteId;
    this.nombreCliente = nombreCliente;
  }

  public FacturaId getFacturaId() {
    return facturaId;
  }

  public ClienteId getClienteId() {
    return clienteId;
  }

  public NombreCliente getNombreCliente() {
    return nombreCliente;
  }
}
