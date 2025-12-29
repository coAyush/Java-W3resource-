//Write a Java program to create a class called Account with instance variables accountNumber and balance.
// Implement a parameterized constructor that initializes these variables with validation:
//
//accountNumber should be non-null and non-empty.
//balance should be non-negative.
//Print an error message if the validation fails.
public class Validation {
    public static void main(String[] args) {
       Student1 s=new Student1(0l,9568.36f);
        System.out.println(s);
    }
}
class Student1 {
    private Long acc_number;
    private float balance;

    @Override
    public String toString() {
        return "Student1{" +
                "acc_number=" + acc_number +
                ", balance=" + balance +
                '}';
    }

    public Student1(Long acc_number,
                    float balance) {
        if(acc_number!=null && acc_number.longValue()!=0){
            this.acc_number = acc_number;
        }else{
            System.out.println("Validation " +
                    "failded");
            return;
        }
        if(balance<0){
            System.out.println("Validation " +
                    "failded");
            return;
        }else{
            this.balance = balance;
        }
    }

}
