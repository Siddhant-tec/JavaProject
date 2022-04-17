import java.util.Scanner;

public class The_Guessing_Game {

    public void start_game() {
        int target = (int) (Math.random() * 10);
        Scanner s = new Scanner(System.in);
        int players = s.nextInt();

        Players[] p = new Players[players];
        int x = 0;
        while (x < players) {
            p[x] = new Players();

            p[x].guess();
            if (target == p[x].number) {
                System.out.println("Player " + (x + 1) + " Won!");
            } else {
                System.out.println("Player " + (x + 1) + " Lost");
                System.out.println("The number was " + target);
            }
            x += 1;
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
        g.start_game();

        }


    }

