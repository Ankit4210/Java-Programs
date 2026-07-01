class BankAccount{
    private double balance;
    public double getBalance(){
        return balance;
    }
    public void deposit(double Amount){
        if(Amount > 0){
            balance += Amount;
        }else{
            System.out.println("Invalid Amount");
        }
    }
}
public class polymorphism {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println(acc.getBalance());
    }
}
