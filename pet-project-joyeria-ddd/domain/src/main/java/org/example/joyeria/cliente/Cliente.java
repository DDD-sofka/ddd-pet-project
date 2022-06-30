package org.example.joyeria.cliente;

import co.com.sofka.domain.generic.Entity;
import org.example.joyeria.cliente.values.ClienteId;
import org.example.joyeria.cliente.values.NombreCliente;

public class Cliente extends Entity<ClienteId> {

    protected NombreCliente nombre;
    protected Clasificacion clasificacion;

    public Cliente(ClienteId entityId, Clasificacion clasificacion) {
        super(entityId);
        this.clasificacion = clasificacion;
    }

    public void cambiarNombre(NombreCliente nombre){
        this.nombre = nombre;
    }

    public NombreCliente nombreCliente(){
        return this.nombre;
    }
}
