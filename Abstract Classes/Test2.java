// Write a Java program to create an abstract class Shape with abstract methods
// calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend
// the Shape class and
// implement the respective methods to calculate the area and perimeter of each shape.
public class Test2 {
    static void main() {
        new Rectanglee().calculateAre();
        new Rectanglee().calculatePerimeter();
    }
}
abstract class Shapee{
    abstract void calculateAre();
    abstract void calculatePerimeter();
}
class Circle extends Shapee{
    @Override
    void calculateAre() {
        System.out.println("Circle");
    }
    @Override
    void calculatePerimeter() {
        System.out.println("Circle");
    }
}
class Rectanglee extends Shapee{
    @Override
    public void calculateAre() {
        System.out.println("Rectangle");
    }
    @Override
    void calculatePerimeter() {
        System.out.println("Rectangle");
    }
}