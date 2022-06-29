package org.example.joyeria.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.value.CalificacionId;
import org.example.joyeria.vendedor.value.Comentario;

public class ComentarioDeUnaCalificacionCambiado extends DomainEvent {
    private final CalificacionId entityId;
    private final Comentario comentario;

    public ComentarioDeUnaCalificacionCambiado(CalificacionId entityId, Comentario comentario) {
        super("joyeria.calificacion.comentariodeunacalificacioncambiado");
        this.comentario = comentario;
        this.entityId= entityId;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public CalificacionId getCalificacionId() {
        return entityId;
    }
}
