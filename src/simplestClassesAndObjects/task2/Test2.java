package src.simplestClassesAndObjects.task2;

public class Test2 {
    private int a;
    private int b;

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println("Default variables = " + test2.getA() + ", " + test2.getB());
        test2.setA(10);
        test2.setB(11);
        System.out.println("Variables after changes = " + test2.getA() + ", " + test2.getB());
    }

    public Test2() {
        a = 5;
        b = 6;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
