package org.example.joyeria.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.example.joyeria.cliente.Clasificacion;
import org.example.joyeria.cliente.events.ClasificacionAgregada;
import org.example.joyeria.cliente.values.ClienteId;
import org.example.joyeria.cliente.values.FacturaId;
import org.example.joyeria.cliente.values.NombreCliente;

public class AgregarClasificacion extends Command {
    private final FacturaId facturaId;
    private final ClienteId clienteId;

    private final Clasificacion clasificacion;

    public AgregarClasificacion(FacturaId facturaId, ClienteId clienteId, Clasificacion clasificacion){
        this.facturaId = facturaId;
        this.clienteId = clienteId;
        this.clasificacion = clasificacion;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }
}
