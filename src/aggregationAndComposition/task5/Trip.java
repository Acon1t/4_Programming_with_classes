package src.aggregationAndComposition.task5;

import java.util.HashMap;

public class Trip {


    private String type;
    private String transport;
    private boolean food;
    private int numberDays;
    private double price;

    private HashMap<String, Double> types = new HashMap<>();
    private HashMap<String, Double> transports = new HashMap<>();

    public Trip(String type, String transport, boolean food, int numberDays) {
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberDays = numberDays;
        types.put("Cruise", 30.0);
        types.put("Rest", 40.0);
        transports.put("Bus", 20.0);
        transports.put("Airplane", 150.0);
        price = (types.get(type) * numberDays) + transports.get(transport);
        if (food) {
            price += 15 * numberDays;
        }
    }

    public HashMap<String, Double> getTypes() {
        return types;
    }

    public HashMap<String, Double> getTransports() {
        return transports;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "tour - " + type + " transport - " + transport + " food - " + food + " duration  - " + numberDays + " price - " + price;
    }
}
