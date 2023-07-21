package src.aggregationAndComposition.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class Suggestion {
    private ArrayList<Trip> trips = new ArrayList<>();

    public Suggestion() {
        trips.add(new Trip("Cruise", "Bus", true, 1));
        trips.add(new Trip("Rest", "Bus", false, 1));
        trips.add(new Trip("Cruise", "Airplane", true, 1));
        trips.add(new Trip("Rest", "Airplane", false, 1));
    }

    public void printTrips() {
        int count = 0;
        for (Trip trip : trips) {
            count++;
            System.out.println(count + " " + trip);
        }
    }

    public Trip selection() {
        printTrips();
        System.out.print("Enter the number: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("1-confirm,2-change settings - 2,3-cancel");
        System.out.print("Enter the number: ");
        int choice = new Scanner(System.in).nextInt();
        if (choice == 1) {
            System.out.println("Order:\n" + trips.get(number - 1));
            return trips.get(number - 1);
        } else if (choice == 2) {
            Trip trip = editor(trips.get(number - 1));
            if (trip != null) {
                System.out.println("Order:\n" + trip);
                return trip;
            }
        } else if (choice == 3) {
            System.out.println("cancel");
            return null;
        }
        return null;
    }

    private Trip editor(Trip trip) {
        Trip editTrip = trip;
        int toggle = 0;
        while (true) {

            System.out.println("1-tour,2-transport,3-food,4-duration,5-save changes,6-cancel");
            System.out.print("Enter the number: ");
            boolean check = false;
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    for (Map.Entry<String, Double> entry : trip.getTypes().entrySet()) {
                        String view = entry.getKey();
                        System.out.println(view);
                    }
                    System.out.print("Enter tour: ");
                    String type = new Scanner(System.in).nextLine();

                    for (Map.Entry<String, Double> entry : trip.getTypes().entrySet()) {
                        if (!type.equals(entry.getKey())) {
                            check = false;
                        } else {
                            editTrip.setType(type);
                            check = true;
                        }
                    }
                    check = false;
                    break;
                case 2:
                    for (Map.Entry<String, Double> entry : trip.getTransports().entrySet()) {
                        String transport = entry.getKey();
                        System.out.println(transport);
                    }
                    System.out.print("Enter transport: ");
                    String transport = new Scanner(System.in).nextLine();

                    for (Map.Entry<String, Double> entry : trip.getTransports().entrySet()) {
                        if (!transport.equals(entry.getKey())) {
                            check = false;
                        } else {
                            editTrip.setTransport(transport);
                            check = true;
                        }
                    }
                    check = false;
                    break;

                case 3:
                    System.out.println("Enter true or false: ");
                    editTrip.setFood(new Scanner(System.in).nextBoolean());
                    break;
                case 4:
                    System.out.print("Enter duration: ");
                    int number = new Scanner(System.in).nextInt();
                    if (number >= 1) {
                        editTrip.setNumberDays(number);
                    }
                    break;
                case 5:
                    return editTrip;
                case 6:
                    editTrip = trip;
                    toggle = 1;
                    break;
            }
            if (toggle == 1) {
                break;
            }
        }
        toggle = 0;
        return null;
    }

    public void sort() {
        trips.sort(Comparator.comparing(Trip::getPrice).reversed());
        for (Trip trip : trips)
            System.out.println(trip);
    }
}
