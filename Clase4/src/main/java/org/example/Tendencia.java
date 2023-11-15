package org.example;

public class Tendencia implements EstadoCancion {
    @Override
    public void setToNormal(Cancion cancion) {
        if (cancion.getUltimaReproduccion() > 24) {
            cancion.setEstado(new Normal());
            System.out.println(Icono.MUSICAL_NOTE.texto() + " - La canción " + cancion.getTitulo() + " dejó de ser reproducida en las últimas 24hs y pasó a ser normal.");
        }
    }

    @Override
    public void setToAuge(Cancion cancion) {

    }

    @Override
    public void setToTendencia(Cancion cancion) {
        if (cancion.getUltimaReproduccion() <= 24) {
            System.out.println(Icono.FIRE.texto() + " - El nivel de popularidad de la canción " + cancion.getTitulo() + "-" + cancion.getArtista() + "(" + cancion.getNombreAlbum() + "-" + cancion.getFechaAlbum() + ") es tendencia.");
        } else {
            System.out.println("La canción dejó de ser tendencia por falta de reproducciones.");
        }
    }

    @Override
    public String toString() {
        return "La canción es tendencia";
    }
}
