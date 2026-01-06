//1. Write a Java program to create a class called Animal with a method called makeSound().
// Create a subclass called Cat that overrides the makeSound() method to bark.

public class Inheritance1 {
     static void main() {
         Animals a = new Animals();
         Cats b = new Cats();
         Animals c = new Cats();
         a.makeSound();
         b.makeSound();
         c.makeSound();
    }
}
class Animals{
    public void makeSound(){
        System.out.println("I'm a makeSound");
    }
}
class Cats extends Animals{
    @Override
    public void makeSound() {
        System.out.println("I' bARK");
    }
}