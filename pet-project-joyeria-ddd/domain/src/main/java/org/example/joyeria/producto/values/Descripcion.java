package org.example.joyeria.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
public class Descripcion implements ValueObject<String> {

    private final String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
    }
    @Override
    public String value() {
        return descripcion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Descripcion that = (Descripcion)  obj;
        return Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion);
    }
}