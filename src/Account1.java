import java.util.Date;
import java.util.Scanner;

abstract class Account1 {
    String name;
    int number;
    int balance;
    Date startDate = new Date();
    abstract double calculateInterest(int years);

}

class CurrentAccount extends Account1{
    public CurrentAccount(int balance){
        this.balance = balance;
    }
    @Override
    public double calculateInterest(int years) {
        double interest;
        interest = (balance*0.05*years);

        return interest;
    }
}

class SavingsAccount extends Account1{
    public SavingsAccount(int balance){
        this.balance = balance;
    }

    @Override
    public double calculateInterest(int years) {
        double interest;
        interest =(balance*0.12*years);
        return interest;
    }
}

class Main2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int type = s.nextInt();
        s.nextLine();
        String name = s.nextLine();
        int a_number = s.nextInt();
        s.nextLine();
        int amount = s.nextInt();
        s.nextLine();
        String startdate = s.nextLine();
        String enddate = s.nextLine();
        int years = Integer.parseInt(enddate.substring(6)) - Integer.parseInt(startdate.substring(6));

        if(type == 1){
            SavingsAccount sa = new SavingsAccount(amount);
            System.out.println(sa.calculateInterest(years));

        }
        if(type == 2){
            CurrentAccount ca = new CurrentAccount(amount);
            System.out.println(ca.calculateInterest(years));
        }

    }

}