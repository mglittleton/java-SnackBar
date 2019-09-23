package snackBar;

public class VendingMach {
    private static int maxId = 0;
    private int id;
    private String name;

    // getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VendingMach(String name) {
        maxId++;
        id = maxId;

        this.name = name;
    }
}