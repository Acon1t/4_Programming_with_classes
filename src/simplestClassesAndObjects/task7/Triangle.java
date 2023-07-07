package src.simplestClassesAndObjects.task7;

import src.simplestClassesAndObjects.task2.Test2;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public static void main(String[] args) {
        Triangle Triangle = new Triangle(1);
        Triangle.print();
        System.out.println("----------------------------");
        Triangle Triangle2 = new Triangle(3, 6, 8);
        Triangle2.print();
    }

    private void print() {
        System.out.println("Square = " + findSquare());
        System.out.println("Perimeter = " + findPerimeter());
        findMedianCross();
    }
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int a) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    private double findSquare() {
        double halfPerimeter = findPerimeter() / 2;
        double square = Math.sqrt(halfPerimeter * (halfPerimeter - this.a) * (halfPerimeter - b) * (halfPerimeter - c));
        return square;
    }

    private double findPerimeter() {
        return this.a + this.b + this.c;
    }

    private void findMedianCross() {
        double medianAB = Math.sqrt(2 * Math.pow(this.a, 2) + 2 * Math.pow(this.b, 2) - Math.pow(this.c, 2)) / 2;
        double medianBC = Math.sqrt(2 * Math.pow(this.b, 2) + 2 * Math.pow(this.c, 2) - Math.pow(this.a, 2)) / 2;
        double medianAC = Math.sqrt(2 * Math.pow(this.a, 2) + 2 * Math.pow(this.c, 2) - Math.pow(this.b, 2)) / 2;
        System.out.println("Median AB = " + medianAB);
        System.out.println("Median AC = " + medianAC);
        System.out.println("Median BC = " + medianBC);
    }
}
