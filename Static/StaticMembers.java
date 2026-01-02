//Write a Java program to create a class called "BankAccount" with instance variables
// 'accountNumber' and balance, and static variables 'bankName' and 'interestRate'. Provide static
// methods to get and set the static variables.
// Create several 'BankAccount' objects and print their details along with the static variables.
public class StaticMembers {
    static void main() {
        BankAccount.setName("Indian Bank");
        BankAccount.setIntrest(6.14f);
        BankAccount b1=new BankAccount();
        b1.accountNumber=58647;
        b1.balance=98684.265f;
        System.out.println(b1.balance+" "+b1.accountNumber+" "+BankAccount.getIntrest()+"%"+" "+BankAccount.getName());
        BankAccount b2=new BankAccount();
        b2.accountNumber=586475;
        b2.balance=98684.651f;
        System.out.println(b2.balance+" "+b2.accountNumber+" "+b2.getIntrest()+"%"+" "+BankAccount.getName());

    }
}
class BankAccount{
    int accountNumber; float balance;
    static String bankName;
    static float intrest;

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public static void setName(String s){
        bankName=s;
    }
    public static void setIntrest(float i){
        intrest=i;
    }
    public  static String getName(){
        return bankName;
    }
    public  static float getIntrest(){
        return intrest;
    }

}

