package snackApp;

public class Customer {
    public int maxID = 0;
    public int id;
    public String name;
    public double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxID++;
        id = maxID;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // public int getID() {
    //     return id;
    // }

    public void addCash(double cashOnHand) {
        this.cashOnHand = this.cashOnHand += cashOnHand;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

}