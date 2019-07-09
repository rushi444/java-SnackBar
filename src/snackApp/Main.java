package snackApp; 

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        Machine m1 = new Machine("Food"); 
        Machine m2 = new Machine("Drink"); 
        Machine m3 = new Machine("Office"); 

        Snack s1 = new Snack("Chips", 36, 1.75, m1.getId()); 
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, m1.getId()); 
        Snack s3 = new Snack("Pretzel", 30, 2.00, m1.getId()); 
        Snack s4 = new Snack("Soda", 24, 2.50, m2.getId()); 
        Snack s5 = new Snack("Water", 20, 2.75, m2.getId()); 

        //1.
        c1.cashOnHand = c1.cashOnHand - (double)s4.getTotalCost(3); 
        s4.quantity = s4.quantity - 3; 
        System.out.println("Jane's cash on hand: " + c1.cashOnHand); 
        System.out.println("Quantity of Soda: " + s4.quantity); 

        //2.
        c1.cashOnHand = c1.cashOnHand - (double)s3.getTotalCost(1); 
        s3.quantity = s3.quantity - 1; 
        System.out.println("Jane's cash on hand: " + c1.cashOnHand); 
        System.out.println("Quantity of Pretzels: " + s3.quantity); 

        //3.
        c2.cashOnHand = c2.cashOnHand - (double)s4.getTotalCost(2); 
        s4.quantity = s4.quantity - 2; 
        System.out.println("Bob's cash on hand: " + c2.cashOnHand); 
        System.out.println("Quantity of Soda: " + s4.quantity); 

        //4. 
        c1.cashOnHand = c1.cashOnHand + 10; 
        System.out.println("Jane has " + c1.cashOnHand + " now"); 

        //5.
        c1.cashOnHand = c1.cashOnHand - (double)s2.getTotalCost(1); 
        s2.quantity = s2.quantity -1; 
        System.out.println("Jane cash on hand: " + c1.cashOnHand); 
        System.out.println("Chocolate Bars left: " + s2.quantity); 

        //6. 
        s3.addQuantity(12);
        System.out.println("Pretzels Remaining: " + s3.quantity); 

        //7. 
        c2.cashOnHand = c2.cashOnHand - (double)s3.getTotalCost(3); 
        s3.buySnack(3);
        System.out.println("Bob's cash on hand: " + c2.cashOnHand); 
        System.out.println("Pretzels Remaining: " + s3.quantity); 
    }
}