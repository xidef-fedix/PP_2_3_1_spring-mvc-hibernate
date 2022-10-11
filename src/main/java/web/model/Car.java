package web.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Car {
    private String model;
    private double engine;
    private String colour;

    public Car(String model, double engine, String colour) {
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", colour='" + colour + '\'' +
                '}';
    }
}
