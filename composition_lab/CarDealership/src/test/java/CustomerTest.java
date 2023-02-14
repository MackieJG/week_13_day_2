import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import components.Engine;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Engine engine;
    Tyres tyres;
    ElectricCar electricCar;


    @Before
    public void setUp(){
        customer = new Customer(80);
        engine = new Engine();
        tyres = new Tyres();
        electricCar = new ElectricCar(1000, "red", engine, tyres);
    }

    @Test
    public void customerHasMoney(){
        assertEquals(80, customer.getMoney(), 0.0);
    }

    @Test
    public void canAddElectricCarToCollection(){
        customer.addVehicle(electricCar);

        assertEquals(1, customer.getVehicleCollection());

    }
}
