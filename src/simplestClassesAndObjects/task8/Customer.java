package src.simplestClassesAndObjects.task8;

public class Customer {

    private int id;
    private String lastName;
    private String name;
    private String middleName;
    private String address;
    private int creditNumber;
    private int bankNumber;
    public static void main(String[] args) {

        Customer[] customers = new Customer[]{
                new Customer(11, "B", "B", "B", "hhhhh", 100, 111111),
                new Customer(10, "A", "A", "A", "ggggg", 350, 222222),
                new Customer(12, "C", "C", "C", "fffff", 450, 333333)};

        AggregatingCustomer base = new AggregatingCustomer(customers);
        base.sortLastName();
        System.out.println("---------------------------");
        base.findCreditCardBetweenNumbers(300, 400);
    }

    public Customer(int id, String lastName, String name, String middleName, String address, int creditNumber, int bankNumber) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.creditNumber = creditNumber;
        this.bankNumber = bankNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String toString() {
        return lastName + " " + name + " " + middleName + " address - " + address +
                " creditNumber - " + creditNumber + " bankNumber - " + bankNumber;
    }
}
