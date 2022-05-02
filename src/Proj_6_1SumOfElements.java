import java.util.ArrayList;
import java.util.Scanner;

public class Proj_6_1SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        sumElements(numbers);

    }
    public static void sumElements(ArrayList<Integer> numbers){
        //numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = 0;
        while (n < 5){
            int input = s.nextInt();
            numbers.add(input);
            n += 1;
        }
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println(sum);

    }
}
