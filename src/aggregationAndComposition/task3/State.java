package src.aggregationAndComposition.task3;

public class State {
    private String name;
    private Region[] regions;
    private double areaState;

    public State(String name, Region... regions) {
        this.name = name;
        this.regions = regions;
    }

    public void printCapital() {
        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                if (district.getCity().isCapital()) {
                    System.out.println("Capital = " + district.getCity().getName());
                }
            }
        }
    }

    public void printNumberRegion() {
        System.out.println("Number of regions = " + (regions.length));
    }

    public void printArea() {
        for (Region region : regions) {
            areaState += region.getArea();
        }
        System.out.println("Square = " + areaState);
    }

    public void printRegionalCenter() {
        System.out.print("Regional centers: ");
        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                System.out.print(district.getCity().getName() + " ");
            }
        }
    }
}