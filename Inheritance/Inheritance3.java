//Write a Java program to create a class called Shape with a method called getArea().
// Create a subclass called Rectangle that overrides the getArea() method to
// calculate the area of a rectangle.
public class Inheritance3 {
     static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.getArea();
    }
}
class Shape{
    public void getArea(){

    }
}
class Rectangle extends Shape{
    @Override
    public void getArea(){
        System.out.println("Area of Rectangle");
    }
}