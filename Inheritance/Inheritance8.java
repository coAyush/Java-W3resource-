//Write a Java program that creates a class hierarchy for employees of a company.
// The base class should be Employee, with subclasses Manager, Developer,
// and Programmer. Each subclass should have properties such as name, address, salary, and job title.
// Implement methods for calculating bonuses, generating performance reports, and managing projects.
public class Inheritance8 {
    static void main() {
        Employeess e2 = new Employeess();
        Manager m= new Manager();
        Developer d = new Developer();
        Programmer p = new Programmer();
    }
}
class Employeess{
    public void bonus(){};
    public void performance(){};
    public void projects(){};
}
class Manager extends Employeess{
    String name,address,salary,job;
    public void bonus(){};
    public void performance(){};
    public void projects(){};

}
class Developer extends Employeess{
    String name,address,salary,job;

    public void bonus(){};
    public void performance(){};
    public void projects(){};

}
class Programmer extends Employeess{
    String name,address,salary,job;

    public void bonus(){};
    public void performance(){};
    public void projects(){};

}