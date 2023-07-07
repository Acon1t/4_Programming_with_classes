package src.simplestClassesAndObjects.task9;

import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private String authors;
    private String publisher;
    private int year;
    private int pageCount;
    private double price;
    private String bindingType;

    public static void main(String[] args) {
        Book[] books = {new Book("AAA", "authorA", "Q", 2000, 333, 49.5, "hardcover", 1),
                new Book("BBB", "authorB", "W", 2001, 333, 75.5, "hardcover", 2),
                new Book("CCC", "authorC", "E", 2002, 333, 79.1, "hardcover", 3),
                new Book("DDD", "authorD", "R", 2003, 222, 59.5, "hardcover", 4),
                new Book("EEE", "authorE", "T", 2004, 222, 543.1, "hardcover", 5)};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println("1-a list of books by a given author, 2-list of books published by a given publisher, 3-list of books released after a given year, 4-exit");
        AggregatingBook AggregatingBook = new AggregatingBook(books);
        while (true) {
            System.out.print("---------------------------");
            System.out.println();
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num == 1)
                AggregatingBook.searchAuthor();
            else if (num == 2) {
                AggregatingBook.searchPublisher();
            } else if (num == 3) {
                AggregatingBook.searchData();
            } else if (num == 4) {
                break;
            }
        }
    }

    public Book(String name, String authors, String publisher, int year, int pageCount, double price, String bindingType, int id) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String toString() {
        return "id = " + id + " | name = " + name + " | authors = " + authors + " | publisher = " + publisher +
                " | year = " + year + " | pageCount = " + pageCount + " | price = " + price + " | bindingType = " + bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

}
