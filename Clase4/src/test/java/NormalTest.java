import org.example.Cancion;
import org.example.EstadoCancion;
import org.example.Normal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NormalTest {
    @Test
    public void cancionConPopularidadNormal() {
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);
        EstadoCancion estado = cancion.getEstado();
        Assertions.assertTrue(estado instanceof Normal);
    }

    // Otra forma de realizar el test usando assertEquals:
    @Test
    public void cancionConPopularidadNormal2() {
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);
        EstadoCancion estado = cancion.getEstado();
        Assertions.assertEquals(Normal.class, estado.getClass());
    }
}
