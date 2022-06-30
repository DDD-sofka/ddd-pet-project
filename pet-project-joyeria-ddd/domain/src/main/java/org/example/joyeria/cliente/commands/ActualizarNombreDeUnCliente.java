package org.example.joyeria.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.cliente.Factura;
import org.example.joyeria.cliente.values.ClienteId;
import org.example.joyeria.cliente.values.FacturaId;
import org.example.joyeria.cliente.values.NombreCliente;
import org.example.joyeria.vendedor.value.Nombre;

public class ActualizarNombreDeUnCliente extends Command {

    private final FacturaId facturaId;
    private final ClienteId clienteId;

    private final NombreCliente nombreCliente;

    public ActualizarNombreDeUnCliente(FacturaId facturaId, ClienteId clienteId, NombreCliente nombreCliente ){
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
