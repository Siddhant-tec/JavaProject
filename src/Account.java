import java.util.Scanner;

public class Account {
    protected String accountNumber;
    protected double balance;
    protected String accountHolderName;

}

class SavingAccount extends Account{
     protected double minimumBalance;

}
class FixedAccount extends SavingAccount{
    protected int lockingPeriod;

}

class AccountBO extends FixedAccount{
    public void getAccountDetails(String detail){
        String[] details = detail.split(",");
        accountNumber = details[0];
        balance =  Double.parseDouble(details[1]);
        accountHolderName = details[2];
        minimumBalance = Double.parseDouble(details[3]);
        lockingPeriod = Integer.parseInt(details[4]);
        System.out.println(accountHolderName + minimumBalance + accountNumber);

        System.out.format("%-20s %-10s %-20s %-20s %s\n%-20s %-10.2f %-20s %-20.0f %d", "Account Number", "Balance", "Account holder name", "Minimum balance", "Locking Period", accountNumber, balance, accountHolderName, minimumBalance, lockingPeriod);



    }
}

class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        AccountBO o = new AccountBO();
        o.getAccountDetails(str);
    }
}