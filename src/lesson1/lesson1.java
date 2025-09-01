package lesson1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class lesson1 {
    public static void main(String[] args) {

        double y = 6.5;
        double x = y * 3.3;
        double p = x + y;
        String text = "Joe is stupid";
        //string type - a reference type in Java that is used to represent text


        System.out.println("Hello World");
        System.out.println(text);
        System.out.print("William loves to play games\n");
        System.out.println("John is British");
        System.out.println(p);

        //variables and Types
        //100 + 256 = ?
        System.out.println(100 + 256);
        //println() only shows the output
        //it does not store any values

        int a = 100;
        int b = 256;
        int c = a + b;
        System.out.println(c);

        int z;//variable declaration
        //for now z = 0
        z = 200;
        System.out.println(z);

        //boolean type
        boolean d = true;//true or false

        boolean e = 100 > 500;
        System.out.println(e);

        //first simple algorithm

        int age = 14;
        if (age > 14) {
            //if age > 14 returns true
            System.out.println("You are accepted");
        } else {
            //if age < 14 returns false
            System.out.println("You are not accepted");
        }
    }
}
