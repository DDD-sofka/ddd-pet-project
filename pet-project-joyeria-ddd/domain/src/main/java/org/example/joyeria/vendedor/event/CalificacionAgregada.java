package org.example.joyeria.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.joyeria.vendedor.value.CalificacionId;
import org.example.joyeria.vendedor.value.Comentario;
import org.example.joyeria.vendedor.value.Puntaje;

public class CalificacionAgregada extends DomainEvent {
    private final Puntaje puntaje;
    private final Comentario comentario;

    public CalificacionAgregada(CalificacionId entityId, Puntaje puntaje, Comentario comentario) {
        super("joyeria.calificacion.calificacioncreada");
        this.puntaje = puntaje;
        this.comentario = comentario;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public Comentario getComentario() {
        return comentario;
    }
}
