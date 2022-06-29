package org.example.joyeria.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.value.CalificacionId;
import org.example.joyeria.vendedor.value.Comentario;

public class ComentarioDeUnaCalificacionCambiado extends DomainEvent {
    public final Comentario comentario;

    public ComentarioDeUnaCalificacionCambiado(CalificacionId entityId, Comentario comentario) {
        super("joyeria.calificacion.comentariodeunacalificacioncambiado");
        this.comentario = comentario;
    }

    public Comentario getComentario() {
        return comentario;
    }
}
