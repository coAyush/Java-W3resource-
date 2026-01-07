public class Test12 {
    static void main() {
        BankC Ayush = new BankC();
        Ayush.deposit(500);
        System.out.println(Ayush);
        Ayush.withdraw(1500);
        System.out.println(Ayush);
    }

}
class BankC{
    private final long accountNumber= 958746L;
    float balance=986578f;
    public void deposit(int amount){
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "BankC{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void withdraw(int amount){
        if(this.balance <100.00f){
            System.out.println("Insufficient funds!");
            return;
        }
        this.balance -= amount;
    }

}
