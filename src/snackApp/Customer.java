package snackApp;

public class Customer {
    private int maxID = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(int id, String name, double cashOnHand) {
        maxID++;
        id = maxID;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getID() {
        return id;
    }

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