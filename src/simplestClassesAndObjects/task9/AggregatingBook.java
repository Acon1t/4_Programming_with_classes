package src.simplestClassesAndObjects.task9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AggregatingBook {
    private Book[] array;
    private boolean check = false;

    public AggregatingBook(Book[] array) {
        this.array = array;
    }

    public void searchAuthor() {
        System.out.println("Enter author: ");
        Scanner scan = new Scanner(System.in);
        String author = scan.nextLine();
        for (Book book : array) {
            if (book.getAuthors().equals(author)) {
                System.out.println(book);
                check = true;
            }
        }
        check(check);
    }

    public void searchPublisher() {
        System.out.println("Enter publisher: ");
        Scanner scan = new Scanner(System.in);
        String publisher = scan.nextLine();
        for (Book book : array) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book);
                check = true;
            }
        }
        check(check);
    }

    public void searchData() {
        System.out.println("Enter year: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        Arrays.sort(array, Comparator.comparing(Book::getYear));
        for (Book book : array) {
            if (book.getYear() > year) {
                System.out.println(book);
                check = true;
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

