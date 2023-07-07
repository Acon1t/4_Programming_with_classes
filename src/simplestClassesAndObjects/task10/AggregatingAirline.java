package src.simplestClassesAndObjects.task10;

import java.time.LocalTime;
import java.util.Scanner;

public class AggregatingAirline {
    private Airline[] array;
    private boolean check = false;

    public AggregatingAirline(Airline[] array) {
        this.array = array;
    }

    public void searchDestination() {
        System.out.println("Enter your destination: ");
        Scanner scan = new Scanner(System.in);
        String Destination = scan.nextLine();
        for (Airline airline : array) {
            if (airline.getDestination().equals(Destination)) {
                System.out.println(airline);
                check = true;
            }
        }
        check(check);
    }

    public void searchWeekday() {
        System.out.println("Enter the day of the week: ");
        Scanner scan = new Scanner(System.in);
        String Weekday = scan.nextLine();
        for (Airline airline : array) {
            if (airline.getDaysOfTheWeek().equals(Weekday)) {
                System.out.println(airline);
                check = true;
            }
        }
        check(check);
    }

    public void searchData() {
        System.out.println("Enter the day of the week: ");
        Scanner scan = new Scanner(System.in);
        String Weekday = scan.nextLine();
        System.out.println("Enter time: ");
        String time = scan.nextLine();
        for (Airline airline : array) {
            if (airline.getDaysOfTheWeek().equals(Weekday)) {
                if (airline.getDepartureTime().isAfter(LocalTime.parse(time))) {
                    System.out.println(airline);
                    check = true;
                }
            }
        }
        check(check);
    }

    private void check(boolean check) {
        if (!check) {
            System.out.println("Not found");
        }
        this.check = false;
    }
}
