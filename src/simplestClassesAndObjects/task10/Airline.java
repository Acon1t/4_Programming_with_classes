package src.simplestClassesAndObjects.task10;

import src.simplestClassesAndObjects.task9.AggregatingBook;
import src.simplestClassesAndObjects.task9.Book;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Airline {

    private String destination;
    private int flightNumber;
    private String aircraftType;
    private LocalTime departureTime;
    private String daysOfTheWeek;
    public static void main(String[] args) {
        Airline[] airlines = new Airline[]{new Airline("AAA", 15, "a", "10:00", "Monday"),
                new Airline("BBB", 11, "a", "12:00", "Monday"),
                new Airline("CCC", 12, "a", "11:00", "Tuesday"),
                new Airline("AAA", 13, "v", "19:00", "Wednesday"),
                new Airline("RRR", 24, "c", "15:40", "Monday")};
        for (int i = 0; i < airlines.length; i++) {
            System.out.println(airlines[i]);
        }
        System.out.println("1-a list of flights for a given destination, 2-list of flights for a given day of the week, 3-list of flights for a given day of the week, the departure time for which is greater than the given one, 4-exit");
        AggregatingAirline AggregatingAirline = new AggregatingAirline(airlines);
        while (true) {
            System.out.print("---------------------------");
            System.out.println();
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num == 1)
                AggregatingAirline.searchDestination();
            else if (num == 2) {
                AggregatingAirline.searchWeekday();
            } else if (num == 3) {
                AggregatingAirline.searchData();
            } else if (num == 4) {
                break;
            }
        }
    }

    public Airline(String destination, int flightNumber, String aircraftType, String departureTime, String daysOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = LocalTime.parse(departureTime, DateTimeFormatter.ofPattern("HH:mm"));
        this.daysOfTheWeek = daysOfTheWeek;

    }

    public String toString() {
        return "destination - " + destination + "| flightNumber - " + flightNumber + "| aircraftType - " + aircraftType + "| departureTime - " + departureTime + "| daysOfTheWeek - " + daysOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(String daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }
}