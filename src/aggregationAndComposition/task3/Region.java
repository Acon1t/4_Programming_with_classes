package src.aggregationAndComposition.task3;

public class Region {
    private String name;
    private District[] districts;
    private double area;
    private double population;
    private int RegionId = 0;

    public Region(String name, double area, double population, District... districts) {
        this.area = area;
        this.name = name;
        this.districts = districts;
        RegionId = RegionId++;
    }

    public District[] getDistricts() {
        return districts;
    }

    public double getArea() {
        return area;
    }

    public double getpPopulation() {
        return population;
    }
}

