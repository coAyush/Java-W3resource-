//6. Write a Java program to create an abstract class Shape3D with abstract methods
// calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the
// Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.
public class Test6 {
    static void main() {
        new Sphere().calculateSurfaceArea();
        System.out.println();;
        new Sphere().calculateVolume();
    }
}

abstract class Shape3D{
    int side=4;
    int radius =5;
    abstract void calculateVolume();
    abstract void calculateSurfaceArea();
}

class Sphere extends Shape3D{
    @Override
    public void calculateVolume() {
        System.out.printf("Volume of spere is " +
                "%f",
                ((4/3)*Math.PI*Math.pow(radius,
                        3)));
    }
    @Override
    public void calculateSurfaceArea() {
        System.out.printf("Surface area of " +
                        "spere is " +
                        "%f",
                4*Math.PI*Math.pow(radius,
                        2));
    }
}
class Cube  extends Shape3D{
    @Override
    public void calculateVolume() {
        System.out.printf("Volume is %f",
                Math.pow(side,3));
    }
    @Override
    public void calculateSurfaceArea() {
        System.out.println("Surface Area is "+4*Math.pow(side,2));
    }
}