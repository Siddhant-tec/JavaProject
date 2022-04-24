import java.util.Arrays;
import java.util.Scanner;

public class SimpleDotCom {
    int[] cells = new int[7];
    int NumberOfHits = 0;

    void setShips(int[] number) {
        int x = 0;
        while (x < number.length) {
            cells[number[x]] = 1;
            x += 1;
        }
        System.out.println(Arrays.toString(cells));
    }


    String Play(int guess) {
        String result = "Miss";
        if (cells[guess] == 1) {
            result = "Hit";
            NumberOfHits += 1;

        }

        if (NumberOfHits == 3) {
            result = "kill";

        }

        System.out.println(result);
        return result;

    }


    int getInput()

    {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        return input;
    }
}

    class GameDriver {
        public static void main(String[] args) {
            int randomNum = (int) (Math.random() * 5);
            int[] locations = {randomNum, randomNum + 1, randomNum + 2};
            //System.out.println(Arrays.toString(locations));



            SimpleDotCom g = new SimpleDotCom();
            g.setShips(locations);
            int i = 0;
            while (i < 3) {
                g.Play(g.getInput());
                i += 1;



            }

        }
    }





