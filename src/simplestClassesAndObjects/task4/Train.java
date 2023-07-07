package src.simplestClassesAndObjects.task4;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Train {
    public static void main(String[] args) {
        Train[] trains = {new Train("AAAa", 1, "12:00"),
                new Train("GGGGGGGGG", 23, "12:00"),
                new Train("VVVVVVVV", 3, "15:00"),
                new Train("Avvcvccv", 4, "19:00"),
                new Train("Abbbbbbb", 5, "11:00")};
        Sort sort = new Sort(trains);
        System.out.println("1 - sorting by numbers, 2 - by destination, 3 - output of information by number, 4-exit");
        while (true) {
            System.out.print("---------------------------");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num == 1)
                sort.sortNumber();
            else if (num == 2) {
                sort.sortDestination();
            } else if (num == 3) {
                Print print = new Print(trains);
            } else if (num == 4) {
                break;
            }
        }
    }

    private String destination;
    private int number;
    private LocalTime departureTime;

    public Train(String destination, int number, String time) {
        departureTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));

        this.destination = destination;
        this.number = number;

    }

    public String toString() {
        return destination + ", " + number + ", " + departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }
}
