//Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:
//
//One constructor takes int parameters.
//Another constructor takes double parameters.
//Print the values of the variables for each constructor.
public class Constructor_Overloading {
    public static void main(String[] args) {
       Point p=new Point(1,2);
        System.out.println(p.x+" "+p.y);
       p=new Point(2.6,53.0);

       System.out.println(p.z+" "+p.b);
    }
}

class Point{
    int x;
    int y;
     Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    double z,b;
    Point(double x,double y){
        z=x;
        b=y;
    }

}