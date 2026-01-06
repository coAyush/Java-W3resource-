//. Write a Java program to create a class known as "BankAccount" with methods called deposit()
// and withdraw(). Create a subclass called SavingsAccount that overrides
// the withdraw() method to prevent withdrawals
// if the account balance falls below one
// hundred.
public class Inheritance5{
    public static void main(String[] args) {
        SavingsAccounts s=new SavingsAccounts();
        s.withdraw();
        System.out.println(s.balance);
    }
}
class BankAccounts{
    float balance=500;
    public void deposit(){};
    public void withdraw(){};
}
class SavingsAccounts extends BankAccounts{
    @Override
    public void withdraw(){
        System.out.println((balance-300<100)?
                "Can't withdraw" : "New Amount " +
                "is"+balance);
        balance=balance-300;
    }
}