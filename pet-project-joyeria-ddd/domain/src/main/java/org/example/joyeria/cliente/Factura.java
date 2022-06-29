package org.example.joyeria.cliente;

public class Factura extends Entity<FacturaId> {

    protected Fecha fecha;

    public Factura(FacturaId entityId, Fecha fecha) {
        super(entityId);
        this.fecha = fecha;
    }

    public void cambiarFecha(Fecha fecha){
        this.fecha = fecha;
    }

    public Fecha fecha(){
        return this.fecha;
    }


}
