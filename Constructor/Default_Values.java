import java.util.Date;

//Write a Java program to create a class called Car with instance variables make, model, and year.
// Implement a parameterized constructor that initializes these variables and assigns default values if
// not provided.
// Print the values of the variables.
public class Default_Values {
    public static void main(String[] args) {
        Car c=new Car("","",null);
        System.out.println(c);
    }
}
class Car{
    String model,make;
    Date year;
    Car(String model,String make,Date year){
        this.model=(model.equals(""))?"default":model;
        this.make=(make.equals(""))?"default":
                make;
        this.year=((year==null)?
                new Date():year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
}
