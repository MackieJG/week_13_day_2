import behaviours.IDrive;
import vehicles.ElectricCar;

import java.util.ArrayList;

public class Dealership{

    private double till;



    ArrayList<IDrive> stock;

    public Dealership(double till) {
        this.till = till;
        stock = new ArrayList<IDrive>();
    }

    public void addVehicle(ElectricCar electricCar){
        this.stock.add(electricCar);
    }
    public Object getVehicleCollection(){
        return this.stock.size();
    }

    public void removeVehicle(ElectricCar electricCar){
        this.stock.remove(electricCar);
    }


}
