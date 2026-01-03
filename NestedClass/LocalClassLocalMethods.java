//Write a Java program to create a class called House with a method calculateArea().
// Inside this method, define a local class Room with a method getArea() that calculates and returns
// the area of the room (length * width).
// Instantiate the Room class and call the getArea() method from within calculateArea().
public class LocalClassLocalMethods {
    public static void main() {
        House h=new House();
        System.out.println(h.calculateArea());
    }
}

class House{
    public float calculateArea(){
        class Room{
            public float getArea(float length,
                                 float breadth){
                return (float)length*breadth;
            }
        }
        Room r=new Room();
        return  r.getArea(25.6f,589.6f);
    }

}