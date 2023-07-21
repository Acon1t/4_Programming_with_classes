package src.aggregationAndComposition.task3;

public class City {
    private int cityId = 0;
    private String name;
    private boolean isCapital = false;

    public City(String name) {
        this.name = name;
        cityId = cityId++;
    }

    public City(String name, boolean isCapital) {
        this.name = name;
        this.isCapital = isCapital;
        cityId = cityId++;

    }

    public boolean isCapital() {
        return isCapital;
    }

    public String getName() {
        return name;
    }
}
