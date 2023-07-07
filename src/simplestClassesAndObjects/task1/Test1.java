package src.simplestClassesAndObjects.task1;

public class Test1 {
    private int a;
    private int b;

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setA(10);
        test1.setB(9);
        test1.print();
        test1.findSum();
        test1.findMax();
    }

    public void print() {
        System.out.println("First variable = " + a);
        System.out.println("Second variable = " + b);
    }

    public void setA(int newA) {
        a = newA;
    }

    public void setB(int newB) {
        b = newB;
    }

    public void findSum() {
        int sum;
        sum = a + b;
        System.out.println("Sum of variables = " + sum);
    }

    public void findMax() {
        int max;
        max = Math.max(a, b);
        System.out.println("Maximum variable = " + max);
    }
}
