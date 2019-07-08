package snackApp;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double price;
    private int machineId;

    public Snack(String name, int quantity, double price, int machineId) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.machineId = machineId;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void buySnack(int quantityPurchased) {
        this.quantity -= quantityPurchased;
    }

    public int getTotalCost() {
        return quantityPurchased * price;
    }

}