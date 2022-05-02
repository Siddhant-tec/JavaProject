public class House {
    private int numStories;
    private int numWindows;
    private String color;

    public House(){

    }

    public House(int numStories, int numWindows, String color){
        this.numWindows = numWindows;
        this.numStories = numStories;
        this.color = color;

    }

    public int getNumStories(){
        return  numStories;
    }
    public void setNumStories(int numStories){
        this.numStories = numStories;
    }

    public int getNumWindows(){
        return numWindows;
    }

    public void setNumWindows(int numWindows){
        this.numWindows = numWindows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }


}

class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(7, 10 ,"red");
        myHouse.setNumStories(3);
        myHouse.setColor("Yellow");
        myHouse.setNumWindows(16);
        printHouseData(myHouse);
        printHouseData(yourHouse);

        System.out.println("My house is " + myHouse.getColor() + " and has " + myHouse.getNumStories() + " stories and " + myHouse.getNumWindows() + " windows" );
        }

        public static void printHouseData(House house){
            System.out.println("My house is " + house.getColor() + " and has " + house.getNumStories() + " stories and " +
                    house.getNumWindows() + " windows");
        }


}