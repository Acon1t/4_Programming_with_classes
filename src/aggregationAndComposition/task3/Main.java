package src.aggregationAndComposition.task3;

public class Main {
    public static void main(String[] args) {
        State state = new State("AAA", new Region("BBB", 10, 1, new District("BB", new City("B"))),
                new Region("CCC", 20, 1, new District("CC", new City("C"))),
                new Region("DDD", 30, 1, new District("DD", new City("D"))),
                new Region("EE", 40, 1, new District("EE", new City("E", true))));
        state.printCapital();
        state.printNumberRegion();
        state.printArea();
        state.printRegionalCenter();
    }
}
