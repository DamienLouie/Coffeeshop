package Unit2;

public class Student {
    //attributes are class variables responsible for storing data in objects
    //What properties the objects will have
    String name;
    int age;
    String id;

    //Constructor


    //Behavior or methods
    //What actions objects can take
    public void printStudentInfo() {
        System.out.println(name + ", " + age + ", " + id);
    }

    public static void printWelcomingMessage(String StudentName) {
        System.out.println(StudentName + ", " + "Welcome to our school!");
    }

    public static void main(String[] args) {
        Student student1 = new Student();//this is a real object that lives in RAM
        student1.name = "John";
        student1.id = "214a";
        student1.age = 15;
        student1.printStudentInfo();
    }
}
