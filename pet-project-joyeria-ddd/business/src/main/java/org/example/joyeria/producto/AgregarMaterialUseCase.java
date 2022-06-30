package org.example.joyeria.producto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.joyeria.producto.comandos.AgregarMaterialComando;

public final class AgregarMaterialUseCase extends UseCase<RequestCommand<AgregarMaterialComando>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarMaterialComando> input) {
        var comando = input.getCommand();
        var producto = Producto.from(
                comando.getProductoId(), repository().getEventsBy(comando.getProductoId().value())
        );

        producto.agregarMaterial(comando.getMaterialId(), comando.getTipoMaterial(), comando.getDescripcion());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));
    }
}
