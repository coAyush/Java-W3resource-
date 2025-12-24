/*Write a Java program to create a class called "Cat" with instance variables name and age.
Implement a default constructor that
initializes the name to "Unknown" and the age to 0. Print the values of the variables.*/
public class Default_Constructor {
    public static void main(String[] args) {
        Cat c=new Cat();
        System.out.println(c.age+"\n"+c.name);
    }
}
class Cat{
    String name;
    int age;
    public Cat(){
        this.name="Unknown";
        this.age=0;
    }
}