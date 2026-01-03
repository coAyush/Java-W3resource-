//Write a Java program to create an abstract class called Animal with an abstract method makeSound().
// In the main method, create an anonymous class that extends
// Animal and override the makeSound() method to print "Meow" for a cat. Call the makeSound() method.
public class AnonymousClassAbstractClas{
    public static void main() {
        Animal a=new Animal(){
           public void makeSound(){
               System.out.println("I am an animal");
           }
        };
        a.makeSound();
    }
}

abstract class Animal{
    abstract void makeSound();
}
