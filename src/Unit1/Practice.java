package Unit1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        //Question 1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a mass in kg: ");
        double mass = scanner.nextDouble();

        System.out.println("Enter a speed in m/sec: ");
        double speed = scanner.nextDouble();

        double KE = 0.5 * mass * speed * speed;
        System.out.println("Kinetic Energy is " + KE + " J");

        //Question 2

        System.out.println("Enter the first value: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second value: ");
        int b = scanner.nextInt();

        System.out.println("Enter the third value: ");
        int c = scanner.nextInt();

        double mean = (a + b + c) / 3.0;
        System.out.println("The mean is: " + Math.round(mean));

        //Question 3

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            if (number > 0) {
                System.out.println("The number is even and positive");
            } else {
                System.out.println("The number is even and not positive");
            }
        } else {
            if (number > 0) {
                System.out.println("The number is odd and positive");
            } else {
                System.out.println("The number is odd and not positive");
            }
        }
        //Question 4
        System.out.println("Enter how many integers you want to sum: ");

        int n = scanner.nextInt();

        int sum = n * (1 + n) / 2;

        System.out.println("The sum of 1 to " + n + ": " + sum);
    }
}


