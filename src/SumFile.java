import java.util.Scanner;

public class SumFile {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int sum = 0;
        while(number > 0){
            sum += number;
            number = s.nextInt();
        }
        System.out.println(sum);
    }

}
