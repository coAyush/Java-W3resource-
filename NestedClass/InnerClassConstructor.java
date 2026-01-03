//Write a Java program to create an outer class called Person with an inner class Address.
// The Address class should have a constructor that takes parameters city and state.
// Create an instance of Address from the Person class and print the address details.

public class InnerClassConstructor {
    public static void main() {
        new Person().printDetails();
    }
}

class Person{
    class Address{
        String city,state;
        public Address(String city,String state){
            this.city=city;
            this.state=state;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    '}';
        }
    }
    Address ad=new Address("Kolkata","West Bengal");
        public void printDetails(){
            System.out.println(ad);
        }
}