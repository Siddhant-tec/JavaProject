import java.util.Scanner;

public class The_Guessing_Game {

    public void start_game(){
        int target = (int) (Math.random() * 10);
        Players p1 = new Players();
        p1.guess();
        if(target == p1.number){
            System.out.println("Player Won!");
        }
        else{
            System.out.println("Player Lost");
            System.out.println("The number was " + target);
        }
    }
    

}

class Players{
    int number = 0;
    public void guess() {
        Scanner s = new Scanner(System.in);
        System.out.println("What's your Guess? ");
        number = s.nextInt();


    }

}


class GuessGameDriver{
    public static void main(String[] args){

        The_Guessing_Game g = new The_Guessing_Game();
        System.out.println("How many Players? ");
        Scanner s = new Scanner(System.in);
        int players = s.nextInt();

        while(players > 0){
            g.start_game();
            players -= 1;

        }


    }
}
