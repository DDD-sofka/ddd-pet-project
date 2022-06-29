package org.example.joyeria.vendedor;

import org.example.joyeria.vendedor.event.*;
import org.example.joyeria.vendedor.value.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class Vendedor extends AggregateEvent<VendedorId> {
    protected Nombre nombre;

    public Vendedor(VendedorId entityId, Nombre nombre) {
        super(entityId);
        appendChange(new VendedorCreado(entityId,nombre)).apply();
    }

    public void agregarCalificacion(CalificacionId entityId, Puntaje puntaje, Comentario comentario) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(puntaje);
        Objects.requireNonNull(comentario);
        appendChange(new CalificacionAgregada(entityId, puntaje, comentario)).apply();
    }

    public void agregarArea(AreaId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new AreaAgregada(entityId, nombre)).apply();
    }

    public void cambiarPuntajeDeUnaCalificacion(CalificacionId entityId, Puntaje puntaje) {
        appendChange(new PuntajeDeUnaCalificacionCambiado(entityId, puntaje)).apply();
    }

    public void cambiarComentarioDeUnaCalificacion(CalificacionId entityId, Comentario comentario) {
        appendChange(new ComentarioDeUnaCalificacionCambiado(entityId, comentario)).apply();
    }

    public void cambiarNombreDeUnArea(AreaId entityId, Nombre nombre) {
        appendChange(new NombreDeUnAreaCambiado(entityId, nombre)).apply();
    }

    public Nombre nombre() {
        return nombre;
    }
}
