package org.example;

public class Auge implements EstadoCancion {

    @Override
    public void setToNormal(Cancion cancion) {
        if (cancion.getDislikes() >= 5000) {
            cancion.setEstado(new Normal());
            System.out.println(Icono.MUSICAL_NOTE.texto() + " - La canción " + cancion.getTitulo() + " pasó de estar en auge a normal.");
        }
    }

    @Override
    public void setToAuge(Cancion cancion) {
        if (cancion.getDislikes() < 5000) {
            System.out.println(Icono.ROCKET.texto() + " - La popularidad de " + cancion.getArtista() + " - " + cancion.getTitulo() + " (" + cancion.getNombreAlbum() + "-" + cancion.getFechaAlbum() + ") está en auge.");
        } else {
            System.out.println("La canción tiene demasiados dislikes para estar en auge.");
        }
    }

    @Override
    public void setToTendencia(Cancion cancion) {
        if (cancion.getReproducciones() > 50000 && cancion.getLikes() > 20000){
            cancion.setEstado(new Tendencia());
            System.out.println(Icono.FIRE.texto() + " - El nivel de popularidad de la canción " + cancion.getTitulo() + "-" + cancion.getArtista() + "(" + cancion.getNombreAlbum() + "-" + cancion.getFechaAlbum() + ") es tendencia.");
        } else {
            System.out.println("La canción no tiene las suficientes reproducciones y likes para ser tendencia.");
        }
    }

    @Override
    public String toString() {
        return "La canción está en auge.";
    }
}
