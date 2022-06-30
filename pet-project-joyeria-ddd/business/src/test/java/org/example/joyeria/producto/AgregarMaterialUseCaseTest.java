package org.example.joyeria.producto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.producto.comandos.AgregarMaterialComando;
import org.example.joyeria.producto.eventos.MaterialAgregado;
import org.example.joyeria.producto.eventos.ProductoCreado;
import org.example.joyeria.producto.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class AgregarMaterialUseCaseTest {

    @InjectMocks
    AgregarMaterialUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void cuandoAgregarMaterialAlProducto() throws IllegalAccessException {

        ProductoId productoId = ProductoId.of("p1");
        MaterialId materialId = MaterialId.of("m1");
        TipoMaterial tipoMaterial = new TipoMaterial("cobre");
        Descripcion descripcion = new Descripcion("Metal semiprecioso");

        var comando = new AgregarMaterialComando(productoId, materialId, tipoMaterial, descripcion);
        Mockito.when(repository.getEventsBy("p1"))
                .thenReturn(history());
        useCase.addRepository(repository);

        var eventos = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(comando))
                .orElseThrow()
                .getDomainEvents();

        var evento = (MaterialAgregado)eventos.get(0);
        Assertions.assertEquals("cobre", evento.tipoMaterial().value());
        Assertions.assertEquals("Metal semiprecioso", evento.descripcion().value());

    }

    private List<DomainEvent> history() throws IllegalAccessException {
        return List.of( new ProductoCreado(new Stock(2.00), new Precio(100.00)));
    }

}