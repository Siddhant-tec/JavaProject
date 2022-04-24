import java.util.Random;

public class DiceSimpulation {
    public static void main(String[] args) {

        Random random = new Random();

        int i = 10;
        while (i > 0) {
            int roll = random.nextInt(6) + 1;
            System.out.println(roll);
            i -= 1;
        }
    }
}