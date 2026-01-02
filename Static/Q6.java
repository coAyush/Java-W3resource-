//Write a Java program to create a class called "IDGenerator" with a static variable 'nextID' and a
// static method "generateID()" that returns the next ID and increments 'nextID'.
// Demonstrate the usage of generateID in the main method.
public class Q6 {
    public static void main() {
        System.out.println(IDGenerator.generateId());
        System.out.println(IDGenerator.generateId());
        System.out.println(IDGenerator.generateId());
        System.out.println(IDGenerator.generateId());
    }
}
class IDGenerator{
    static int nextID;
    public static int generateId(){
        nextID++;
        return nextID;
    }
}