package org.example.joyeria.vendedor;

import org.example.joyeria.vendedor.event.*;
import org.example.joyeria.vendedor.value.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Vendedor extends AggregateEvent<VendedorId> {
    protected Nombre nombre;
    protected Set<Calificacion> calificaciones;
    protected AreaId areaId;

    public Vendedor(VendedorId entityId, Nombre nombre) {
        super(entityId);
        appendChange(new VendedorCreado(entityId, nombre)).apply();
    }

    private Vendedor(VendedorId entityId) {
        super(entityId);
        subscribe(new VendedorChange(this));
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

    public Optional<Calificacion> getCalificacionPorId(CalificacionId calificacionId) {
        return calificaciones()
                .stream()
                .filter(calificacion -> calificacion.identity().equals(calificacionId))
                .findFirst();
    }

    public void cambiarNombre(VendedorId entityId, Nombre nombre){
        appendChange(new NombreCambiado(entityId,nombre)).apply();
    }

    public Nombre nombre() {
        return nombre;
    }

    public AreaId areaId() {
        return areaId;
    }

    public Set<Calificacion> calificaciones() {
        return calificaciones;
    }
}
