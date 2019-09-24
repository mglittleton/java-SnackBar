package employeeApp;

public class Company {
  private static int maxId = 0;

  public int id;
  public String name;
  public int debt;

  public Company(String name, int debt) {
    maxId++;
    this.id = maxId;

    this.debt = debt;
    this.name = name;
  }
}