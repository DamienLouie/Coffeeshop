package Lab1;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        //getting user input
        Scanner scanner = new Scanner(System.in);

        //getting text input
        String text = scanner.nextLine();
        //next() and nextLine() is a function of the Scanner class
        //that allows us to get user text input
        System.out.println("the entered text is: " + (text + text));
        //We get the string literal "11", not the number 2, because text is not a numerical value. It is a string.

        System.out.println("Enter an integer number: ");
        int num = scanner.nextInt();
        System.out.println("doubled number: " + num * 2);


    }
}
