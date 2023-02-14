import behaviours.IDrive;
import vehicles.ElectricCar;

import java.util.ArrayList;

public class Customer{

    private double money;

    private ArrayList<IDrive> vehicles;

    public Customer(double money) {
        this.money = money;
        vehicles = new ArrayList<IDrive>();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<IDrive> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<IDrive> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(ElectricCar electricCar){
        this.vehicles.add(electricCar);
    }
    public Object getVehicleCollection(){
       return this.vehicles.size();
    }
}
