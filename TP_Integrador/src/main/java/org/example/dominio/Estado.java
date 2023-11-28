package org.example.dominio;

public interface Estado {

    public void creado(Incidente incidente);
    public void asignado(Incidente incidente);
    public void resuelto(Incidente incidente);
}
