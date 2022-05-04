import java.util.Scanner;

public class VISACard {
    private String holderName;
    private String ccv;

    public double computeRewardPoints(String purchasetype, double amount){
        double reward;
        reward = (amount * 0.01);
        return  reward;

    }

}

class HPVISACard extends  VISACard{

    public double computeRewardPoints(String purchaseType, double amount){
        double reward;
        reward = (amount * 0.01);
        if (purchaseType.equals("fuel")){
            reward += 10;
        }
        return  reward;
    }
}

class Main3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String cvv = s.nextLine();
        double bill = s.nextDouble();
        s.nextLine();
        String ptype = s.nextLine();
        int choice =  s.nextInt();
        s.nextLine();
        VISACard v = new VISACard();
        HPVISACard h = new HPVISACard();

        if(choice == 1){
            System.out.println(v.computeRewardPoints(ptype, bill));
        }

        if(choice == 2){
            System.out.println(h.computeRewardPoints(ptype, bill));
        }


     }
}
