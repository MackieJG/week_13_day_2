import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import vehicles.HybridCar;


import static org.junit.Assert.assertEquals;

public class HybridCarTest {
        HybridCar hybridCar;

        Engine engine;

        Tyres tyres;



        @Before
        public void setUp(){
            engine = new Engine();
            tyres = new Tyres();
            hybridCar = new HybridCar(50000, "red", engine, tyres);
        }

        @Test
        public void canGetColor(){
            assertEquals("red", hybridCar.getColor());
        }
        @Test
        public void canGetPrice(){
            assertEquals(50000, hybridCar.getPrice());
        }
}
