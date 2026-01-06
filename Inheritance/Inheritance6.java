// Write a Java program to create a class called Animal with a method named move().
// Create a subclass called Cheetah that overrides the move() method to run.
public class Inheritance6 {
    static void main() {
        Cheetah c=new Cheetah();
        c.move();
    }
}
class Animalss{
    public void move(){};
}
class Cheetah extends Animalss{
    public void move(){
        System.out.println("Cheetah");
    }
}