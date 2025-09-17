package Lab2;


public class Pet {
    private String name;
    private String species;
    private int age;
    private double weight;

    public Pet(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSpecis() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } {
            System.out.println("Age cannot be negative");
        }
    }
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be positive");
        }
    }
    public void makeSound() {
        if (species.equals("Dog")) {
            System.out.println(name + " says Woof!");
        } else if (species.equals("Cat")) {
            System.out.println(name + " says Meow!");
        } else {
            System.out.println(name + " makes a sound.");
        }
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Specis: " + species);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " lbs");
    }
}
/*
1. Why do we make attributes private instead of public?
We make attributes private to enforce encapsulation, protecting an object's internal state from invalid or unintended changes by external code.
2. What is a method signature? Give an example from your code.
A method signature is the unique combination of the method's name and its parameter list, such as public void deposit(double amount).
3. What is the difference between a getter and a setter?
A getter is a method that retrieves (reads) the value of a private attribute, while a setter is a method that updates (writes) the value of a private attribute, often including validation logic.
4. Why did we add if-statements in some setters?
We add if-statements in setters to validate the input data, ensuring the object's state remains consistent and correct by only allowing logical values.
5. What would happen if we removed the "this" keyword in the constructors?
If we removed the "this" keyword, the constructor parameters would be assigned to themselves, leaving the object's attributes uninitialized (e.g., balance = balance; would do nothing).
6. When should a method return a value? When should it return void?
A method should return a value when it needs to provide a result or information back to the caller, and it should be void when its purpose is solely to perform an action without returning any data.
 */


