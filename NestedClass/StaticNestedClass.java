//Write a Java program to create an outer class called University with a static nested class Department.
// The Department class should have a method "displayInfo()" that prints the department name and the number of
// faculty members.
// Instantiate the Department class from the main method and call the "displayInfo()" method.

public class StaticNestedClass {
    public static void main(String[] args) {
        University.Department d=
                new University.Department();
        //in case ofstatic we dont' need to
        // create outer class objecct just use dot
        // operator to reference it
        d.displayInfo();
    }
}

class University{
    static class Department{
        int members =5;
        public void displayInfo(){
            System.out.println("Department Name" +
                    " is IT"+" "+"Faculty " +
                    "members ="+members
            );
        }
    }
}