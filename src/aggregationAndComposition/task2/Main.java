package src.aggregationAndComposition.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel("A", 15.0));
        wheels.add(new Wheel("A", 15.0));
        wheels.add(new Wheel("A", 15.0));
        wheels.add(new Wheel("A", 15.0));
        Engine engine = new Engine(100);
        Car car = new Car("White", "ABC", wheels, engine, 5);
        System.out.println(car.getWheels());
        Wheel replacement = new Wheel("B", 15.0);
        car.replaceWheel(replacement, 2);
        System.out.println(car.getWheels());
        car.printCarModel();
        car.refuel(3);
        car.move();
    }
}
