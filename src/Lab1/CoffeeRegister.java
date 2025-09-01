package Lab1;

import java.util.Scanner;

public class CoffeeRegister {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("How many cups of latte do you need");
        int lattecount = scan.nextInt();
        System.out.println("how much is each cup");
        double lattePrice = scan.nextDouble();
        System.out.println("Do you want to give us tips");
        double tip = scan.nextDouble();
        double total = lattecount * lattePrice + tip;
        System.out.println("That would be " + total + " dollars!");
        System.out.println("Total: $" + total);
        //Research findings:
        //double x = 5; is allowed because it counts as 5.0
        //int y= 5.5; is not allowed because 5.5 has decimal
        System.out.println("\n--- Experiment 1: Integer Division ---");
        System.out.println("How many cookies? ");
        int cookies = scan.nextInt();
        System.out.println("How many kids? ");
        int kids = scan.nextInt();
        double cookiesPerKid = (double) cookies / kids;
        System.out.println("Each kid gets: " + cookiesPerKid + " cookies");

        System.out.println("\n--- Experiment 2: Bonus Points ---");
        int loyaltyPoints = 10;

        System.out.println("Points: " + loyaltyPoints);
        loyaltyPoints += 5; // Add 5
        System.out.println("After bonus: " + loyaltyPoints);

        loyaltyPoints *= 2; // Double for weekend promo
        System.out.println("After promo: " + loyaltyPoints);

        int a = 5;
        int b = 5;
        int c = ++a; //prefix: increment THEN assign
        int d = b++; //postfix: assign THEN increment

        System.out.println("c = " + c + ", a = " + a); //c=6, a=6
        System.out.println("d = " + d + ", b = " + b); //d=5, b=6

        double itemPrice = 3.99;
        int quantity = 2;
        double subtotal = itemPrice * quantity;
        int roundedPrice = (int) subtotal;
        System.out.println("Rounded total: " + roundedPrice);
        //The original code failed to compile since it did not correctly use types

        /*
        1. What happens when you store a double in an int? What is lost?
        The decimal part is lost
        2. Why does 5/2 give 2, not 2.5?
        because you use int
        3. When would you use explicit casting? When is it automatic?
        Because sometimes the decimal part is necessary. When you switch a double to an integer, it is automatic.
        4. What's one real-world situation where ++x vs x++ could cause a bug?
        When you write an algorithm, there might be unexpected outputs.
        5. What surprised you most about how Java handles numbers?
        It is interesting
         */
    }
}
