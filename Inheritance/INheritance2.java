// Write a Java program to create a class called Vehicle with a method called drive().
// Create a subclass called Car that overrides the drive() method to print "Repairing a car".

public class INheritance2 {
    static void main() {
        Vehicle v=new Cars();
        v.drive();
    }
}

class Vehicle{
    public void drive(){

    }
}

class Cars extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Repairing a car");
    }
}