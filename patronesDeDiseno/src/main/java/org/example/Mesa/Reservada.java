package org.example.Mesa;
public class Reservada implements Estado {

    @Override
    public void ocupar(Mesa m) {
        // si los comensales son los que reservaron
        m.setState(new Ocupada());
        System.out.println("Se ha ocupado la mesa " + m.getNumber());
    }

    @Override
    public void reservar(Mesa m) {
        System.out.println("No es posible reservar una mesa ya reservada.");
    }

    @Override
    public void liberar(Mesa m) {
        System.out.println("No se puede liberar una mesa reservada");
    }
}
