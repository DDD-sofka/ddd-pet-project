package test.usecasevendedor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.example.joyeria.factura.Clasificacion;
import org.example.joyeria.factura.Factura;
import org.example.joyeria.factura.commands.AgregarCliente;
import org.example.joyeria.factura.commands.AgregarFactura;
import org.example.joyeria.factura.events.ClienteAgregado;
import org.example.joyeria.factura.events.FacturaAgregada;
import org.example.joyeria.factura.values.*;
import org.example.joyeria.usecasefactura.CrearClienteUseCase;
import org.example.joyeria.usecasefactura.CrearFacturaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CrearClienteUseCaseTest {

  @InjectMocks
  CrearClienteUseCase useCase;

  @Test
  public void cuandoSeCreaUnCliente() {
    // arrange
    FacturaId facturaId = FacturaId.of("1017");
    ClienteId clienteId = ClienteId.of("1017272663");
    var factura = new AgregarFactura(facturaId,clienteId);

    NombreCliente nombreCliente = new NombreCliente("pedro");
    ClasificacionId clasificacionId = ClasificacionId.of("1");
    Tipo tipo = new Tipo("Plata");
    Clasificacion clasificacion = new Clasificacion(clasificacionId, tipo);


    var command2 = new AgregarCliente(clienteId,nombreCliente, clasificacion);

    // act
    var events =
        UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command2))
            .orElseThrow()
            .getDomainEvents();

    // assert
    var event = (ClienteAgregado) events.get(0);
    Assertions.assertEquals("1017272663", event.getClienteId().value());
  }
}
