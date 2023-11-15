import org.example.Cancion;
import org.example.Normal;
import org.example.Tendencia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TendenciaTest {

    @Test
    public void cancionEnAugePasaATendencia() {
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);
        cancion.setReproducciones(2001);
        cancion.setToAuge();
        cancion.setReproducciones(50001);
        cancion.setLikes(20001);
        cancion.setToTendencia();
        Assertions.assertEquals(Tendencia.class, cancion.getEstado().getClass());
    }

    @Test
    public void cancionEnTendenciaPasaANormal() {
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);
        cancion.setReproducciones(2001);
        cancion.setToAuge();
        cancion.setReproducciones(50001);
        cancion.setLikes(20001);
        cancion.setToTendencia();
        cancion.setUltimaReproduccion(25);
        cancion.setToNormal();
        Assertions.assertEquals(Normal.class, cancion.getEstado().getClass());
    }
}
