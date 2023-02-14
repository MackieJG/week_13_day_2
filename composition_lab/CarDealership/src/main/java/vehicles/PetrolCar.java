package vehicles;

import behaviours.IDrive;
import components.Engine;
import components.Tyres;


public class PetrolCar implements IDrive {

    private double price;
    private String color;
    private Engine engine;
    private Tyres tyres;

    public PetrolCar(double price, String color, Engine engine, Tyres tyres) {
        this.price = price;
        this.color = color;
        this.engine = engine;
        this.tyres = tyres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyre() {
        return tyres;
    }

    public void setTyre(Tyres tyres) {
        this.tyres = tyres;
    }

    @Override
    public String driving(String data) {
        return "Car goes: " + data;
    }
}
