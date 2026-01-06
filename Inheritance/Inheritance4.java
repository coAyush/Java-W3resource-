//Write a Java program to create a class called Employee with methods called work() and getSalary().
// Create a subclass called HRManager that overrides the work() method and adds a new method called
// addEmployee().
public class Inheritance4 {
    static void main() {
        HRManager hr=new HRManager();
        hr.addEmployee();hr.work();
    }
}

class Employee{
    public void work(){};
    public void getSalary(){};
}
class HRManager extends  Employee{
    public void addEmployee(){
        System.out.println("its my work");
    }
    @Override
    public void work(){
        System.out.println("I am doing my work");
    }
}
