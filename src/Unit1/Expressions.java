package Unit1;

import java.util.Scanner;

public class Expressions {
    public static void main(String[] args) {
        System.out.println(5 / 2);
        //When you divide integer by integer
        //you do not get another integer

        double x = 5 / 2;
        System.out.println(x);

        int y = (int)5.7;
        System.out.println(y);
        //java simply cuts all the digits after the decimal point

        int z = Integer.parseInt("12551");
        System.out.println(z);

        int phonenumber = 1524618;
        System.out.println(Integer.MAX_VALUE);

        int first = phonenumber % 10;//8
        phonenumber = phonenumber /10;//we remove 8
        //after that the phonenumber becomes 152461

        int second = phonenumber % 10;//1
        phonenumber = phonenumber /10;//15246

        int third = phonenumber % 10;//6
        phonenumber = phonenumber /10;//1524

        System.out.println("last 3 digits: " + first + ", " + second + ", " + third);

        //how to check even/odd numbers
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any positive integer: ");
        int input = scanner.nextInt();

        if(input % 2 == 0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }





    }
}
