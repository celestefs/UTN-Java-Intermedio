import org.example.Auge;
import org.example.Cancion;
import org.example.Normal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AugeTest {

    @Test
    public void cancionNormalPasaAEstarEnAuge() {
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);
        cancion.setReproducciones(2001);
        cancion.setToAuge();
        Assertions.assertEquals(Auge.class, cancion.getEstado().getClass());
    }

    @Test
    public void cancionEnAugePasaANormal() {
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);
        cancion.setReproducciones(2001);
        cancion.setToAuge();
        cancion.setDislikes(6000);
        cancion.setToNormal();
        Assertions.assertEquals(Normal.class, cancion.getEstado().getClass());
    }
}
