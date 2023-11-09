package org.example.Mesa;

public class Libre implements Estado {
    @Override
    public void ocupar(Mesa m) {
        m.setState(new Ocupada());
        System.out.println("Se ha ocupado la mesa " + m.getNumber());
    }

    @Override
    public void reservar(Mesa m) {
        m.setState(new Reservada());
        System.out.println("Se ha reservado la mesa " + m.getNumber());
    }

    @Override
    public void liberar(Mesa m) {
        System.out.println("No se puede liberar una mesa liberada");
    }
}
