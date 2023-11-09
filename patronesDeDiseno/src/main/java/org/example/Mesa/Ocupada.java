package org.example.Mesa;

public class Ocupada implements Estado {

    @Override
    public void ocupar(Mesa m) {
        System.out.println("No es posible ocupar una mesa que está ocupada");

    }

    @Override
    public void reservar(Mesa m) {
        System.out.println("No es posible reservar una mesa que está ocupada");
    }

    @Override
    public void liberar(Mesa m) {
        m.setState(new Libre());
        System.out.println("Se ha liberado la mesa " + m.getNumber());
    }
}
