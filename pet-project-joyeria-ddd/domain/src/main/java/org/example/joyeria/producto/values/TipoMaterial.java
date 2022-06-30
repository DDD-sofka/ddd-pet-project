package org.example.joyeria.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoMaterial implements ValueObject<String> {

    public TipoMaterial(String material) {
        this.material = Objects.requireNonNull(material);
    }

    private final String material;

    @Override
    public String value() {
        return material;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        TipoMaterial that = (TipoMaterial)  obj;
        return Objects.equals(material, that.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material);
    }

}
