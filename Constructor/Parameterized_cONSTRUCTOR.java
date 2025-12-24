/*Write a Java program to create a class called Dog with instance variables name and color.
Implement a parameterized constructor that takes name and color as parameters and
 initializes the instance variables. Print the values of the variables.*/
public class Parameterized_cONSTRUCTOR {
    public static void main(String[] args) {

        Dog d=new Dog("Tommy","Brown");
        System.out.println(d);
    }
}
class Dog{
    String name;
    String color;
    public Dog(String name,String color){
        this.name=name;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
