import java.util.ArrayList;
import java.util.Scanner;

public class min_element_array {
    public static void main(String[] args)  {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int num = 8;
        while(num > 0) {
            int input = s.nextInt();
            numbers.add(input);
            num -= 1;
        }
        int min = numbers.get(0);
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }

}
