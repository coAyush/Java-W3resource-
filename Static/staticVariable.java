//Write a Java program to create a class called "Counter" with a static variable count.
//Implement a constructor that increments count
// every time an object is created.
// Print the value of count after creating several objects.
public class staticVariable {
    public static void main(String[] args) {
        Counter c=new Counter();
        Counter c3=new Counter();
        Counter c2=new Counter();
        System.out.println(Counter.count+
                "icremented by"+Counter.c);
    }
}
class Counter{
    static int count;
    static Counter c;
     Counter(){
        count++;
        c=this;
    }
}