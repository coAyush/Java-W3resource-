import java.util.Scanner;

//Write a Java program to create a class called Constants with a static final variable 'PI'
// initialized to 3.14159. Create a method to calculate the area of a circle
// given its radius, using the 'PI' constant. Demonstrate the method in the main method.
public class StaticFinal {

    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an radius");
        int r=sc.nextInt();
        System.out.println(calculate(r));

    }
    public static float calculate(int r){
        return (float)(Constants.a*Math.pow(r,2));
    }
}
class Constants{
    static final float a=3.14159f;
}