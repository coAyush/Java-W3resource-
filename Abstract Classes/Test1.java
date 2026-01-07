//Write a Java program to create an abstract class Animal with an abstract method called sound().
// Create subclasses Lion and Tiger that extend the
// Animal class and implement the sound() method to make a specific sound for each animal.
public class Test1 {
    static void main() {
        new Lion().sound();
        new Tiger().sound();
    }
}

abstract class Animaal{
    abstract public void sound();
}

class Lion extends Animaal{
    @Override
    public void sound() {
        System.out.println("Lion");
    }
}
class Tiger extends Animaal{
    @Override
    public void sound(){
        System.out.println("I am Tiger My roar " +
                "is loud");
    }
}