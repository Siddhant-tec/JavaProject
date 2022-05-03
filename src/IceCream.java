import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;

    public IceCream(String name, int cost, int numScoops){
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        this.toppings = new ArrayList<>();

    }

    public void addToppings(String topping){
        toppings.add(topping);
    }

    public String getName(){
        return name;
    }

    public int getCost(){
        return cost;

    }

    public int getNumScoops(){
        return numScoops;
    }

    public void printToppings(){
        for(String topping : toppings){
            System.out.println(topping);
        }

    }

}

class IceCreamDemo{
    public static void main(String[] args) {
        IceCream ice = new IceCream("Vanilla", 40, 2);
        System.out.println("Ice Cream: " + ice.getName());
        System.out.println("Scoops: " + ice.getNumScoops());
        System.out.println("Cost: " + ice.getCost());
        ice.addToppings("Sprinklers");
        ice.addToppings("Nuts");
        System.out.println("Toppings: ");
        ice.printToppings();

    }
}
