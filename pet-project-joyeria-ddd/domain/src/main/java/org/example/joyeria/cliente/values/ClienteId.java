package org.example.joyeria.cliente.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class ClienteId extends Identity{

    public ClienteId(String uuid) {
        super(uuid);
    }

    public ClienteId() {
    }

    public static ClienteId of(String id){
        return new ClienteId(id);
    }

}