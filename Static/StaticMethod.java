//Write a Java program to create a class called "MathUtility" with a static method add that takes
// two integers and returns their sum.
// Demonstrate the usage of this static method in the main method without creating an instance of
// "MathUtility".
public class StaticMethod {
    public static void main() {
        System.out.println(MathUtility.total(3,
                5));
    }
}
class MathUtility{
    public static int total(int a,int b){
        return a+b;
    }
}