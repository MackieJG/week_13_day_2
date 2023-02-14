import behaviours.IDrive;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import components.Engine;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    Engine engine;

    Tyres tyres;



    @Before
    public void setUp(){
        engine = new Engine();
        tyres = new Tyres();
        electricCar = new ElectricCar(50000, "red", engine, tyres);
    }

    @Test
    public void canGetColor(){
        assertEquals("red", electricCar.getColor());
    }
    @Test
    public void canGetPrice(){
        assertEquals(50000, electricCar.getPrice());
    }

}
