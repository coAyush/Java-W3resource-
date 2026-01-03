//Write a Java program to create an outer class called Computer with an inner class Processor.
// The Processor class should have a method "displayDetails()" that prints the details of the processor
// (e.g., brand and speed).
// Create an instance of Processor from the Computer class and call the "displayDetails()" method.

public class InnerClass {
    public static void main() {
        Computer.Processor p =
                new Computer().new Processor();
        System.out.println(p.displayDetail());
    }
}

class Computer{
    class Processor{
        public  String displayDetail(){
            return "Processor is intel i5 clock" +
                    " " +
                "speed is 5.4ghZ";
        }
    }
}