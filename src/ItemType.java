import java.util.*;

public class ItemType {
    private String name;
    private double  deposit;
    private double costPerDay;

    public ItemType(){

    }

    public ItemType(String name, double deposit, double costPerDay){
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;


    }

    public String getName(){
        return name;
    }

    public double getDeposit(){
        return deposit;
    }

    public double getCostPerDay(){
        return costPerDay;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setCostPerDay(double costPerDay){
        this.costPerDay = costPerDay;
    }

}

class ItemTypeDemo{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ItemType> itemList = new ArrayList<>();
        int input = s.nextInt();
        s.nextLine();
        ItemType temp;
        while(input --> 0){
            try {
                temp = new ItemType(s.nextLine(), Double.parseDouble(s.nextLine()), Double.parseDouble(s.nextLine()));
                //itemList.add(new ItemType(s.nextLine(), Double.parseDouble(s.nextLine()), Double.parseDouble(s.nextLine())));
                itemList.add(temp);
            }
            catch (NumberFormatException e){
                System.out.println(e);
            }
        }
        Collections.sort(itemList, Comparator.comparing(ItemType::getCostPerDay));

        for(ItemType a : itemList){
            System.out.println(a.getName() + " " +  a.getCostPerDay() + " " + a.getDeposit());
        }
    }

}

