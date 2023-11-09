package org.example.Mesa;
public interface Estado {
    public void ocupar(Mesa m);
    public void reservar(Mesa m);
    public void liberar(Mesa m);
}
