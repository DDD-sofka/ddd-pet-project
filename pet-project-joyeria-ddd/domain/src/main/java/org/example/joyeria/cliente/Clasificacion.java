package org.example.joyeria.cliente;

import co.com.sofka.domain.generic.Entity;
import org.example.joyeria.cliente.values.ClasificacionId;
import org.example.joyeria.cliente.values.Tipo;

public class Clasificacion extends Entity<ClasificacionId> {

    protected Tipo tipo;

    public Clasificacion(ClasificacionId entityId, Tipo tipo) {
        super(entityId);
        this.tipo = tipo;
    }

    public void cambiarTipo(Tipo tipo){
        this.tipo = tipo;
    }

    public Tipo tipo(){
        return this.tipo;
    }


}
