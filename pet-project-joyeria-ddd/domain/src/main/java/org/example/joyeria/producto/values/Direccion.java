package org.example.joyeria.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {

    private final String direccion;

    public Direccion(String direccion) {
        this.direccion = Objects.requireNonNull(direccion);
    }

    @Override
    public String  value() {
        return direccion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Direccion that = (Direccion)  obj;
        return Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion);
    }
}

