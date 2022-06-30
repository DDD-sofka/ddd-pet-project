package org.example.joyeria.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Double> {

    private final Double precio;

    public Precio(Double precio) throws IllegalAccessException {
        this.precio = Objects.requireNonNull(precio);
        if(precio <= 0 ){
            throw new IllegalAccessException("El precio debe ser mayor que cero");
        }
    }

    @Override
    public Double value() {
        return precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Precio that = (Precio)  obj;
        return Objects.equals(precio, that.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio);
    }
}
