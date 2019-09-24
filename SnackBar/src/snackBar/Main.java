package snackBar;

public class Main {
    public static void buyingThings() {
        Customer cust1 = new Customer("Jane", 45.25);
        Customer cust2 = new Customer("Bob", 33.14);

        VendingMach food = new VendingMach("Food");
        VendingMach drink = new VendingMach("Drink");
        VendingMach office = new VendingMach("Office");

        Snack snack1 = new Snack(36, "Chips", 1.75, food.getId());
        Snack snack2 = new Snack(36, "Chocolate Bar", 1, food.getId());
        Snack snack3 = new Snack(30, "Pretzel", 2, food.getId());
        Snack snack4 = new Snack(24, "Soda", 2.5, drink.getId());
        Snack snack5 = new Snack(20, "Water", 2.75, drink.getId());

        // Processing #1
        double purch1 = snack4.buyQuantity(3);
        cust1.buyStuff(purch1);
        System.out.println(
                cust1.getName() + " buys some " + snack4.getName() + " and now has $" + cust1.getCash() + " left.");
        System.out.println("     There are " + snack4.getQuantity() + " left.");
        System.out.println("-----------");

        // Processing #2
        double purch2 = snack3.buyQuantity(1);
        cust1.buyStuff(purch2);
        System.out.println(
                cust1.getName() + " buys some " + snack3.getName() + " and now has $" + cust1.getCash() + " left.");
        System.out.println("     There are " + snack3.getQuantity() + " left.");
        System.out.println("-----------");

        // Processing #3
        double purch3 = snack4.buyQuantity(2);
        cust2.buyStuff(purch3);
        System.out.println(
                cust2.getName() + " buys some " + snack4.getName() + " and now has $" + cust2.getCash() + " left.");
        System.out.println("     There are " + snack4.getQuantity() + " left.");
        System.out.println("-----------");

        // Processing #4
        cust1.addCash(10);
        System.out.println(cust1.getName() + " found $10 and now has $" + cust1.getCash() + ".");
        System.out.println("-----------");

        // Processing #5
        double purch4 = snack2.buyQuantity(1);
        cust1.buyStuff(purch4);
        System.out.println(
                cust1.getName() + " buys some " + snack2.getName() + " and now has $" + cust1.getCash() + " left.");
        System.out.println("     There are " + snack2.getQuantity() + " left.");
        System.out.println("-----------");

        // Processing #6
        snack3.addQuantity(12);
        System.out.println(snack3.getName() + " now has " + snack3.getQuantity() + " in stock.");
        System.out.println("-----------");

        // Processing #7
        double purch5 = snack3.buyQuantity(3);
        cust2.buyStuff(purch5);
        System.out.println(
                cust2.getName() + " buys some " + snack3.getName() + " and now has $" + cust2.getCash() + " left.");
        System.out.println("     There are " + snack3.getQuantity() + " left.");
        System.out.println("-----------");

        // Stretch
        double snack1Total = snack1.getQuantity() * snack1.getCost();
        System.out.println("All " + snack1.getQuantity() + " of the " + snack1.getName() + " in the " + food.getName() + " machine \ncan be bought for $" + snack1Total + ".\n------------");

        double snack2Total = snack2.getQuantity() * snack2.getCost();
        System.out.println("All " + snack2.getQuantity() + " of the " + snack2.getName() + " in the " + food.getName() + " machine \ncan be bought for $" + snack2Total + ".\n------------");

        double snack3Total = snack3.getQuantity() * snack3.getCost();
        System.out.println("All " + snack3.getQuantity() + " of the " + snack3.getName() + " in the " + food.getName() + " machine \ncan be bought for $" + snack3Total + ".\n------------");
        
        double snack4Total = snack4.getQuantity() * snack4.getCost();
        System.out.println("All " + snack4.getQuantity() + " of the " + snack4.getName() + " in the " + food.getName() + " machine \ncan be bought for $" + snack4Total + ".\n------------");
        
        double snack5Total = snack5.getQuantity() * snack5.getCost();
        System.out.println("All " + snack5.getQuantity() + " of the " + snack5.getName() + " in the " + food.getName() + " machine \ncan be bought for $" + snack5Total + ".\n------------");
    }

    public static void main(String[] args) {
        buyingThings();
    }

}