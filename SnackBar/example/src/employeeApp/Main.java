package employeeApp;

public class Main {
  public static void workWithData() {
    Healthplan h1 = new Healthplan("My Health Plan 1");
    Healthplan h2 = new Healthplan("My Health Plan 2");

    Company c1 = new Company("Company A", 100);

    Employee emp1 = new Employee("Jack", "Jackson", 25000.75, true, c1.id, h1.getId());
    Employee emp2 = new Employee("May", "Ford", 36783.20, true, c1.id, h2.getId());

    System.out.println("**** Query Data ****");
    System.out.println(emp1);
    System.out.println(c1);

    System.out.println("**** Data Types - Numbers ****");
    System.out.println("Original divided 5 " + (c1.debt / 5));
    System.out.println("Original mod 2     " + (c1.debt % 2));
    System.out.println("Original divided 7 " + (c1.debt / 7));
    System.out.println("Original divided 7 " + (c1.debt / 7.0));
    System.out.println("Original divided 7 " + ((double) c1.debt / 7));
    System.out.println();
    String myStr = "100";
    System.out.println("Debt: " + myStr + c1.debt);
    System.out.println("Debt: " + Integer.parseInt(myStr) + c1.debt);
    int tempInt = Integer.parseInt(myStr) + c1.debt;
    System.out.println("Debt: " + tempInt);
    double tempDouble = emp1.getSalary() + 1000;
    System.out.println("Salary: " + tempDouble);
  }

  public static void main(String[] args) {
    workWithData();
  }
}