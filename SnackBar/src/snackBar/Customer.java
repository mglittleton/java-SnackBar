package snackBar;

public class Customer {
    private static int maxId = 0;

    private int id;
    private String name;
    private double cash;

    // constructor
    public Customer(String name, double cash) {
        maxId++;
        id = maxId;

        this.name = name;
        this.cash = cash;
    }

    public int getId() {
        return id;
    }

    public double getCash() {
        return cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCash(double cashAdded) {
        cash = cash + cashAdded;
    }

    public void buyStuff(double cashSpent) {
        cash = cash - cashSpent;
    }
}