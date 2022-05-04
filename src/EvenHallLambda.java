import java.util.ArrayList;
import java.util.Scanner;

public class EvenHallLambda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> hall = new ArrayList<>();
        while(n --> 0){
            hall.add(s.nextInt());
        }
        hall.forEach(integer -> {
            if (integer%2 == 0){
                System.out.println(integer);
            }
        });
    }
}
