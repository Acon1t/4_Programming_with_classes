package src.simplestClassesAndObjects.task4;

import java.util.Scanner;

public class Print {


    public Print(Train[] trains) {
        print(trains);
    }

    private void print(Train[] trains) {
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean check = false;
        for (Train train : trains) {
            if (train.getNumber() == n) {
                check = true;
                System.out.println(train.getDestination() + " " + train.getNumber() + " " + train.getDepartureTime() + " ");
                break;
            }
        }

        if (!check) {
            System.out.println("The train is missing");
            System.out.println();
        }
    }
}
