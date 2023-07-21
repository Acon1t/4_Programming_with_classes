package src.aggregationAndComposition.task4;

public class Account {
    private long id;
    private double balance;
    private boolean isOpen = true;

    public Account(double balance) {
        this.balance = balance;
        this.id = ++id;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getStatus() {
        String status = isOpen ? "Unlocked" : "Blocked";
        return "Account " + id + " " + status;
    }

    public void block() {
        isOpen = false;
    }

    public void unlock() {
        isOpen = true;
    }
}
