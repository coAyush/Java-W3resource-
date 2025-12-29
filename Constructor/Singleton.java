//Write a Java program to create a class called Singleton that ensures only one instance of the class
// can be created. Implement a private constructor and a public static method to get the single instance of the
// class.
// Print a message indicating the creation of the instance.
public class Singleton {
    public static void main(String[] args) {
        Student s=Student.getObject(1,"ayush");
        System.out.println(s);
        Student s1 = Student.getObject(2,"ayush");
        System.out.println(s1);
    }
}
class Student{
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private Student(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println("Object Created");
    }
    static Student s;
    public static  Student getObject(int id,String name) {
        if (s == null) {
            s = new Student(id, name);
        }else{
            System.out.println("Object Already Exists");
        }
        return s;
    }

}