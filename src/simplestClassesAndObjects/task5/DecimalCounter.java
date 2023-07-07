package src.simplestClassesAndObjects.task5;

public class DecimalCounter {
    private int max;
    private int min;
    private int current;

    public static void main(String[] args) throws Exception {
        DecimalCounter DecimalCounter = new DecimalCounter(15, 10, 15);
        System.out.println("Min = " + DecimalCounter.getMin() + " Max = " + DecimalCounter.getMax() + " Current = " + DecimalCounter.getCurrentValue());
        DecimalCounter.getNext();
        System.out.println("Next = " + DecimalCounter.getCurrentValue());
        DecimalCounter.getPrior();
        DecimalCounter.getPrior();
        System.out.println("Previous = " + DecimalCounter.getCurrentValue());
        System.out.println("--------------------------");
        DecimalCounter DecimalCounter2 = new DecimalCounter();
        System.out.println("Min = " + DecimalCounter2.getMin() + " Max = " + DecimalCounter2.getMax() + " Current = " + DecimalCounter2.getCurrentValue());
        DecimalCounter2.getNext();
        System.out.println("Next = " + DecimalCounter2.getCurrentValue());
        DecimalCounter2.getPrior();
        DecimalCounter2.getPrior();
        System.out.println("Previous = " + DecimalCounter2.getCurrentValue());
    }

    public DecimalCounter() {
        max = 10;
        min = 5;
        current = 7;
    }

    public DecimalCounter(int max, int min, int start) throws Exception {
        if (max < min)
            throw new Exception("Error");
        if (start > max || (start < min))
            throw new Exception("Error");
        this.max = max;
        this.min = min;
        current = start;
    }

    public void getNext() throws Exception {
        current++;
        if (current > max) {
            current=max;
            System.out.println("The counter has reached its maximum");
        }
    }

    public void getPrior() throws Exception {
        current--;
        if (current < min) {
            current=min;
            System.out.println("The counter has reached its minimum");
        }
    }

    public int getCurrentValue() {
        return current;
    }

    public int setCurrentValue(int value) throws Exception {
        if (value > max || (value < min)) {
            throw new Exception("Error");
        }
        current = value;
        return value;
    }

    public int getMax() {
        return max;
    }

    public int setMax(int value) {
        max = value;
        return value;
    }

    public int getMin() {
        return min;
    }

    public int setMin(int value) {
        min = value;
        return value;
    }
}
