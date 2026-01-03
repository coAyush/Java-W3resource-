//Write a Java program to create an interface called Greeting with a method sayHello().
// In the main method, create an anonymous class that implements
// the Greeting interface and override the sayHello() method to print "Hello, World!".
// Call the sayHello() method.
public class AnonymousClass {
    public static void main() {
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("hELLO FROM " +
                        "ANONYMOUS");
            }
        };
        g.sayHello();
    }

}
