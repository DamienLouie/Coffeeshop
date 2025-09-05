package Lab1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TheSecretAgentDecoderRing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 7-digit agent ID: ");
        int phoneNumber = scan.nextInt();
        int last4 = phoneNumber % 10000;//Gets remainder when divided by 10000
        System.out.println("Last 4 digits: " + last4);
        int d1 = last4 % 10;
        int d2 = last4 /10 % 10;
        int d3 = last4 /100 % 10;
        int d4 = last4 /1000 % 10;
        System.out.println("Digits: " + d4 + ", " + d3 + ", " + d2 + ", " + d1);
        System.out.println("Enter temperature in Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = celsius * 9/5 + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        int code = 1 + 2 * 5 + (3 + 7);
        System.out.println("Vault code: " + code);
        //Prediction: 21 I was right

        System.out.println(5 + 3 * 2); //11
        System.out.println((5 + 3) * 2); //16
        System.out.println(10 / 3 * 2); //6
        System.out.println(10.0 / 3 * 2); //6.67

        //I was right

        System.out.println(1 + 2 * 3); //7
        System.out.println("Score: " + 1 + 2 * 3); //Score: 16
        System.out.println("Score: " + (1 + 2 * 3)); //Score: 7
        System.out.println(5 / 2 + 1.5); //3.5
        System.out.println(5.0 / 2 + 1.5); //4.0

        //I was right

        //Reflection and Research

        /*
        REFLECTION QUESTIONS:
        1. Why does 7 / 3 give 2, not 2.333? How can you get the decimal answer?
        Because integer division truncates the decimal; use floating-point numbers (like 7.0 / 3) to get the decimal answer.
        2. How can you extract the middle digit of a 3-digit number (like 583 -> 8)?
        Divide the number by 10, then take the remainder when divided by 10 (e.g., (583 / 10) % 10).
        3. Why does "Answer: " + 5 + 3 give "Answer: 53", but "Answer: " + (5 + 3) give "Answer: 8"?
        The first example performs string concatenation, while the parentheses in the second force the numbers to be added first.
        4. When converting Celsius to Fahrenheit, why is it dangerous to use all integers?
        Using integers can truncate the decimal result of the conversion formula, leading to an inaccurate temperature.
        5. Research: What is "Operator precedence"? List the order of: +, *, /, %, ()
        Operator precedence is the order in which operations are evaluated; the order is: parentheses (), multiplication *, division /, addition +, subtraction -.
        6. Bonus: How would you get the **first digit** of a 4-digit number?
        (e.g., 7284 -> 7)
        Divide the number by 1000 (e.g., 7284 / 1000).
         */








    }
}
