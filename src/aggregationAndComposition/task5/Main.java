package src.aggregationAndComposition.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Suggestion suggestion = new Suggestion();
        System.out.println("1 - available tours,2 - sort by price,3 - choose a tour,4 - exit");
        while (true) {
            System.out.print("Enter the number: ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    suggestion.printTrips();
                    break;
                case 2:
                    suggestion.sort();
                    break;
                case 3:
                    suggestion.selection();
                    break;
                case 4:
                    return;
            }
        }
    }
}

