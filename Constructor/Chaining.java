import java.util.Scanner;

/*Write a Java program to create a class called
 Student with instance variables studentId,\ studentName, and grade. Implement a default
 constructor and a parameterized constructor that takes all three instance variables.
 Use constructor chaining to initialize the variables. Print the values of the variables.*/
public class Chaining {
    public static void main(String[] args) {
        System.out.println(new Students());
    }
}
class Students{
    int id;
    String name;
    Character grade;
    Students(){
        this(1,"ayusg",'a');//chaining means
        // calling a constructor from another
        // constructor
        //also remember for chaing this() must
        // be the first line of calling
        // costructor else we get error bcoz
        // jvm will get confused
    }
    Students(int id,String name,Character grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
