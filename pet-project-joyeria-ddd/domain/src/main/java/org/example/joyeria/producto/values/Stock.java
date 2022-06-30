package org.example.joyeria.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Stock implements ValueObject<Double> {

    private final Double cantidad;

    public Stock(Double cantidad) throws IllegalAccessException {
        this.cantidad = Objects.requireNonNull(cantidad);
        if(cantidad < 0 ){
            throw new IllegalAccessException("El stock no puede ser inferior a cero");
        }

    }
    public Stock cambiarStock( Double cantidad ) throws IllegalAccessException {
        return new Stock(cantidad);
    }

    @Override
    public Double value() {
        return cantidad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Stock that = (Stock)  obj;
        return Objects.equals(cantidad, that.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidad);
    }
}
