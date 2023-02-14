import components.Tyres;
import components.Engine;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import vehicles.HybridCar;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    ElectricCar electricCar;
    PetrolCar petrolCar;
    HybridCar hybridCar;
    Engine engine;
    Tyres tyres;

    Customer customer;

    @Before
    public void setUp(){
        dealership = new Dealership(10000);
        engine = new Engine();
        tyres = new Tyres();
        electricCar = new ElectricCar(1000, "red", engine, tyres);
        petrolCar = new PetrolCar(1000, "blue", engine, tyres);
        hybridCar = new HybridCar(1000, "green", engine, tyres);
        customer = new Customer(2000000);
    }

    @Test
    public void canAddCarToCollection(){
        dealership.addVehicle(electricCar);
        assertEquals(1, dealership.getVehicleCollection());

    }

    @Test
    public void canSellVehiclesToCustomers(){
        dealership.addVehicle(electricCar);
        dealership.removeVehicle(electricCar);
        customer.addVehicle(electricCar);
        assertEquals(1, customer.getVehicleCollection());
        assertEquals(0, dealership.getVehicleCollection());
    }

    @Test
    public void
}
