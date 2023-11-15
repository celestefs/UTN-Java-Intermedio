package org.example;

public class Main {

    public static void main(String[] args) {

        // 1) Se lanza la canción con popularidad normal
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);
        System.out.println(cancion.getEstado());

        // 2) Seteo reproducciones para que la canción pase a estar en auge
        cancion.setReproducciones(1001);
        cancion.setToAuge();

        // 3) La canción pasa a estado normal por la cantidad de dislikes
        System.out.println(cancion.getEstado());
        cancion.setDislikes(5000);
        cancion.setToNormal();

        // 4) La canción pasa a ser tendencia por cantidad de reproducciones y likes
        System.out.println(cancion.getEstado());
        cancion.setReproducciones(50001);
        cancion.setLikes(20001);
        cancion.setToTendencia();

        // 5) La canción pasa de tendencia a normal por falta de reproducciones
        System.out.println(cancion.getEstado());
        cancion.setUltimaReproduccion(26);
        cancion.setToNormal();
    }
}