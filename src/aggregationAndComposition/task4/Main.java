package src.aggregationAndComposition.task4;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("AAAAAAAAAAAAA");
        Client client1 = new Client("qqq", "wwww", "1111");
        Client client2 = new Client("eee", "rrrr", "2222");
        bank.addNewClient(client1);
        bank.addNewClient(client2);
        client1.openAccount(new Account(333.1));
        client1.openAccount(new Account(222.2));
        client1.openAccount(new Account(-100.1));
        client1.openAccount(new Account(300.1));
        client2.openAccount(new Account(150.00));
        client2.openAccount(new Account(-100.00));
        client2.openAccount(new Account(0.50));
        client2.openAccount(new Account(-10.00));
        System.out.println("----------------------------------------");
        System.out.println(bank.getClient("1111").getAccount(1).getStatus());
        bank.getClient("1111").blockAccaunt(1);
        System.out.println(bank.getClient("1111").getAccount(1).getStatus());
        System.out.println("-----------------------------------------");
        System.out.println(bank.getClient("1111").getInformation());
        System.out.println(bank.getClient("2222").getInformation());
        bank.getClient("1111").sortByBalance();
        System.out.println(bank.getClient("1111").getInformation());
        bank.getClient("2222").sortByBalance();
        System.out.println(bank.getClient("2222").getInformation());
        System.out.println("-----------------------------------------------");
        System.out.println(client1.toString() + ", total balance: " + client1.getBalance());
        System.out.println(client2.toString() + ", total balance: " + client2.getBalance());
        System.out.println("-----------------------------------------------------------");
        System.out.println(client1.toString() + ", positive balance: " + client1.getBalancePositiveAccounts());
        System.out.println(client2.toString() + ", positive balance: " + client2.getBalancePositiveAccounts());
        System.out.println("----------------------------------------------------");
        System.out.println(client1.toString() + ", negative balance: " + client1.getBalanceNegativeAccounts());
        System.out.println(client2.toString() + ", negative balance: " + client2.getBalanceNegativeAccounts());
    }
}
