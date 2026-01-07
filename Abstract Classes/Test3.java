// Write a Java program to create an abstract class BankAccount with abstract methods
// deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the
// BankAccount class and
// implement the respective methods to handle deposits and withdrawals for each account type.
public class Test3 {
    static void main() {
        new SavingsAccount().deposit(500);
    }
}

abstract class BaankAccount{
    abstract public void deposit(int bal);
    abstract public void withdraw(int amt);
}
class SavingsAccount extends BaankAccount{
    int balance=500;
    public void deposit(int bal){
        this.balance+=bal;
        System.out.println("Savings account balance is "+balance);
    };
     public void withdraw(int amt){
        if(balance-amt<0){
            System.out.println("Savings account balance is negative");
        }
        else{
            this.balance-=amt;
            System.out.println("Savings account balance is "+balance);
        }
    };
}
class CurrencyAccount extends BaankAccount{
    int balance=500;
    public void deposit(int bal){
        this.balance+=bal;
        System.out.println("Current account " +
                "balance is "+balance);    };
    public void withdraw(int amt){
        System.out.println("Savings");
    }
}