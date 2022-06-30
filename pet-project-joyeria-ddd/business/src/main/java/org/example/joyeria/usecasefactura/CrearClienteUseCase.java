package org.example.joyeria.usecasefactura;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.joyeria.factura.Cliente;
import org.example.joyeria.factura.Factura;
import org.example.joyeria.factura.commands.AgregarCliente;
import org.example.joyeria.factura.commands.AgregarFactura;

public class CrearClienteUseCase extends UseCase<RequestCommand<AgregarCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarCliente> agregarClienteRequestCommand) {
        var command = agregarClienteRequestCommand.getCommand();

        var clienteId = command.getClienteId();
        var nombreCliente = command.getNombreCliente();
        var clasificacion = command.getClasificacion();
        var cliente = new Cliente(clienteId, nombreCliente, clasificacion);

        var factura = command.getFactura();

        factura.agregarCliente(cliente);

        emit().onResponse(new ResponseEvents(factura.getUncommittedChanges()));
    }
}
