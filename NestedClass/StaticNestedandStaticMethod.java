//Write a Java program to create an outer class called 'MathUtil' with a static nested class Calculator.
// The Calculator class should have a static method add(int a, int b)
// that returns the sum of a and b. Call the add() method from the main method.

public class StaticNestedandStaticMethod {
    public static void main() {
        MathUtil.Calculator calc=
                new MathUtil.Calculator();
        System.out.printf("Sum is %d ",
                calc.add(5,9));
    }
}

 class MathUtil{
    static class Calculator{
        int add(int a,int b){
            return a+b;
        }
    }
}