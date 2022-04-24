import java.util.Scanner;

public class Dvisibley3 {
    public static void main(String[] args){
        System.out.println("Enter your integer: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if(input % 3 == 0){
            System.out.println(input + " is divisible by 3 ");
        }
        else {
            System.out.println(input + " is not divisible by 3 ");
        }
    }
}
