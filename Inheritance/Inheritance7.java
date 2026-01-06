//Write a Java program to create a class known as Person with methods called getFirstName()
// and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId()
// and overrides the getLastName() method to include the employee's job title.
public class Inheritance7 {
    static void main() {
        Employees e1 = new Employees();
        Employees e2 = new Employees();
        System.out.println(e1.getEmployeeId());
        e1.getLname();
    }
}
class Persons{
    public void getFname(){};
    public void getLname(){};
}
class Employees extends Persons{
    int id=54;
    public void getFname(){};
    public void getLname(){
        String title="IT"+this.getEmployeeId();
        System.out.println(title);
    };;
    public int getEmployeeId(){
        return this.id;
    }
}