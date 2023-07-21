package src.aggregationAndComposition.task2;

import java.util.List;

public class Car {
    private String color;
    private String carModel;
    private List<Wheel> wheels;
    private Engine engine;
    private int fuel;

    public Car(String color, String carModel, List<Wheel> wheels, Engine engine, int fuel) {
        this.color = color;
        this.carModel = carModel;
        this.wheels = wheels;
        this.engine = engine;
        this.fuel = fuel;
    }
    public String getWheels() {
        return wheels.toString();
    }
    public String getCarModel() {
        return carModel;
    }

    public String toString() {
        return "Car: " +
                "color = " + color + ' ' +
                ", carModel = " + carModel + ' ' +
                ", wheels = " + wheels +
                ", engine = " + engine;
    }

    public void printCarModel() {
        System.out.println(getCarModel());
    }

    public void move() {
        if (fuel > 0) {
            System.out.println("The car is moving");
        } else {
            System.out.println("The car is not moving, check the fuel ");
        }
    }

    public void refuel(int fuelToAdd) {
        fuel += fuelToAdd;
    }

    public void replaceWheel(Wheel wheelToReplace, int wheelIndex) {
        wheels.remove(wheelIndex);
        wheels.add(wheelIndex, wheelToReplace);
    }
}
