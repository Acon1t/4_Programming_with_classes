package src.simplestClassesAndObjects.task8;

import java.util.Arrays;
import java.util.Comparator;

public class AggregatingCustomer {
    Customer[] customers;

    public AggregatingCustomer(Customer[] customers) {
        this.customers = customers;
    }

    public void sortLastName() {
        Arrays.sort(customers, Comparator.comparing(Customer::getLastName));
        for (Customer i : customers) {
            System.out.println(i);
        }
    }

    public void findCreditCardBetweenNumbers(long start, long end) {
        for (Customer customer : customers) {
            if (customer.getCreditNumber() >= start && customer.getCreditNumber() <= end) {
                System.out.println(customer);
            }
        }
    }
}
