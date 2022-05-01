import java.util.ArrayList;
import java.util.Scanner;

public class Proj_5_1_NamePermutations {
    public static void main(String[] args){
        int n = 0;
        Scanner s = new Scanner(System.in);
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        while(n < 5){
            System.out.println(n + 1 + " Enter your full name: ");
            String fullName = s.nextLine();
            int spaceLocation = fullName.indexOf(" ");
            String first = fullName.substring(0, spaceLocation);
            firstNames.add(first);
            String last = fullName.substring(spaceLocation + 1);
            lastNames.add(last);
            n += 1;
        }

        for(String first: firstNames){
            for(String last: lastNames){
                System.out.println(first + " " + last);
            }
        }
    }
}
