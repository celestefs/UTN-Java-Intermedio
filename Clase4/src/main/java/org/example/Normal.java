package org.example;

public class Normal implements EstadoCancion {
    @Override
    public void setToNormal(Cancion cancion) {
        System.out.println(Icono.MUSICAL_NOTE.texto() + " - El nivel de popularidad de la canción de " + cancion.getArtista() + " perteneciente al Album " + cancion.getNombreAlbum() + " llamada " + cancion.getTitulo() + " es normal.");
    }

    @Override
    public void setToAuge(Cancion cancion) {
        if (cancion.getReproducciones() > 1000) {
            cancion.setEstado(new Auge());
            System.out.println(Icono.ROCKET.texto() + " - La popularidad de " + cancion.getArtista() + " - " + cancion.getTitulo() + " (" + cancion.getNombreAlbum() + "-" + cancion.getFechaAlbum() + ") pasó a estar en auge.");
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
        return "La popularidad de la canción es normal ya que aún no tiene las suficientes reproducciones para estar en auge.";
    }
}
