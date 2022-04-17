public class Monster {
    boolean frighten(int degree){
        System.out.println("Arggg...");
        return true;
    }


}

class Vampire extends Monster{
    boolean frighten(int degree){
        System.out.println("Sucks blood");
        return true;
    }
}

class Dragon extends Monster{
    boolean frighten(int degree){
        System.out.println("Breathes Fire!");
        return true;

    }

}

class MonsterTestDrive{
    public static void main(String[] args){
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();

        int x = 0;
        while(x < 3){
            ma[x].frighten(x);
            x += 1;

        }


    }
}