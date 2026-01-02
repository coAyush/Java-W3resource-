import java.util.concurrent.atomic.AtomicInteger;

//Write a Java program to create a class called "Initializer" with a static block that initializes a
// static variable 'initialValue' to 1000.
// Print the value of 'initialValue' before and after creating an instance of "Initializer".
public class StaticBlock {
    public static void main() {
        System.out.println("Before "+Initializer.initialValue);
        Initializer init=new Initializer();
        System.out.println("After "+Initializer.initialValue);
    }
}
class Initializer{
    static int  initialValue;
    static{
         initialValue=1000;
        System.out.println("initialValue="+initialValue);
    }
}