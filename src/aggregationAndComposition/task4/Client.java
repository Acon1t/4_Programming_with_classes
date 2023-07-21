package src.aggregationAndComposition.task4;

import java.util.ArrayList;
import java.util.Comparator;

public class Client {
    private String firstName;
    private String lastName;
    private String passportID;
    private ArrayList<Account> accounts;

    Client(String firstName, String lastName, String passportID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
        accounts = new ArrayList<>();
    }

    public String getBalance() {
        double balance = 0;
        for (Account account : accounts) {
            balance += account.getBalance();
        }
        return balance + " dollars";
    }

    public String getBalancePositiveAccounts() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() > 0) {
                balance += account.getBalance();
            }
        }
        return balance + " dollars";
    }

    public String getBalanceNegativeAccounts() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() < 0) {
                balance += account.getBalance();
            }
        }
        return balance + " dollars";
    }

    public void sortByBalance() {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public Account getAccount(long id) {
        for (Account client : accounts) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }

    void openAccount(Account account) {
        accounts.add(account);
    }

    public void blockAccaunt(long id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.block();
            }
        }
    }

    public void unlockAccaunt(long id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.unlock();
            }
        }
    }

    public String getInformation() {
        String information = "";
        int i = 1;
        for (Account account : accounts) {
            information += "#" + i + ", balance: " + account.getBalance() + " dollars, status: " + account.getStatus() + "\n";
            i++;
        }
        return "Client " + toString() + " has accounts:\n" + information;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName + ", Passport: " + passportID;
    }
}
