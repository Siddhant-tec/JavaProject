public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner){
        this.owner = owner;
        this.balance = 0;

    }

    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;

        }

    public void deposit(int amount){
        if(amount > 0){
            this.balance += amount;
        }
        else{
            System.out.println("Please enter minimum balance greater than 0!");
        }

    }

    public void withdraw(int amount){
        if(amount <= this.balance){
            this.balance -= amount;
        }
        else {
            System.out.println("Insufficient Balance!");
        }


    }

    public  String getOwner(){
        return owner;
    }

    public int getBalance(){
        return balance;
    }

}

class BankAccountDemo{
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Siddhant", 5000);
        BankAccount b = new BankAccount("Ashish");

        System.out.println("New Account opened!");
        b.deposit(1000);
        System.out.println(b.getOwner());
        System.out.println(b.getBalance());
        b.withdraw(500);
        System.out.println(b.getBalance());
        System.out.println();

        System.out.println(a.getOwner());
        a.deposit(1000);
        System.out.println(a.getBalance());
        a.withdraw(4000);
        System.out.println(a.getBalance());

    }
}

