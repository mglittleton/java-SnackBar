package snackBar;

public class Snack {
    private static int maxId = 0;

    private int id;
    private int quantity;
    private double cost;
    private String name;
    private int vendMachId;

    public Snack(int quantity, String name, double cost, int vendMachId) {
        maxId++;
        id = maxId;

        this.quantity = quantity;
        this.name = name;
        this.cost = cost;
        this.vendMachId = vendMachId;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVendMachId() {
        return vendMachId;
    }

    public void setVendMachId(int vendMachId) {
        this.vendMachId = vendMachId;
    }

    public void addQuantity(int numToAdd) {
        quantity = quantity + numToAdd;
    }

    public double buyQuantity(int numToBuy) {
        quantity = quantity - numToBuy;
        return numToBuy * cost;
    }

    public double giveSubtotal(int numToBuy) {
        double subtotal = numToBuy * cost;
        return subtotal;
    }
}