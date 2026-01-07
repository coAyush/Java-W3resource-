//5. Write a Java program to create an abstract class Employee with abstract methods
// calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend
// the Employee class
// and implement the respective methods to calculate salary and display information for each role.
public class Test5 {
    static void main() {
        new Manager1().calculateSalary();
    }
}
abstract class Employee1{
    float salary=582690f;
    abstract public void calculateSalary();
    abstract public void displayInfo();
}

class Manager1 extends Employee1{
    @Override
    public void calculateSalary() {
        salary=salary*6/5;
        System.out.println("salary of Manager " +
                "is "+this.salary);
    }
    @Override
    public void displayInfo() {
        System.out.println("salary of Manager " +
                "is "+this.salary+" "+"Manager " +
                "id is"+256);
    }
}

class Programmer1 extends Employee1{
    @Override
    public void calculateSalary() {
        this.salary=salary*11/10;
        System.out.println("salary of Programmer " +
                "is "+this.salary);
    }
    @Override
    public void displayInfo() {
        System.out.println("I am a programmer");
    }
}