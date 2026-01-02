//Write a Java program to create a class called "ComplexInitializer" with a static block that
// initializes multiple static variables (x, y, z)
// using complex logic. Print the values of these variables in the main method.
public class Q7 {
    static void main() {
        System.out.println(ComplexInitializer.x+" "+ComplexInitializer.y+" "+ComplexInitializer.z);
    }
}
class ComplexInitializer{
    static int x,y,z;
    static{
        x=5;y=9;
        z=calculate(x,y);
    }
    public static int calculate(int a,int b){
        return a*b-(a+b);
    }
}
