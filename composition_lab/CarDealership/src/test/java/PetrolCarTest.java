import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.PetrolCar;
import static org.junit.Assert.assertEquals;

public class PetrolCarTest {
    PetrolCar petrolCar;

    Engine engine;

    Tyres tyres;


    @Before
    public void setUp() {
        engine = new Engine();
        tyres = new Tyres();
        petrolCar = new PetrolCar(50000, "red", engine, tyres);
    }

    @Test
    public void canGetColor() {
        assertEquals("red", petrolCar.getColor());
    }

    @Test
    public void canGetPrice() {
        assertEquals(50000, petrolCar.getPrice(), 0.0);
    }
}