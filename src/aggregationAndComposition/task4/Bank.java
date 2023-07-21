package src.aggregationAndComposition.task4;

import java.util.*;

public class Bank {
    private String name;
    private ArrayList<Client> clients;

    Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public Client getClient(String passportID) {
        for (Client person : clients) {
            if (person.getPassportID().equals(passportID)) {
                return person;
            }
        }
        return null;
    }

    public void addNewClient(Client client) {
        clients.add(client);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Bank " + name + " has " + clients.size() + " customers";
    }
}
