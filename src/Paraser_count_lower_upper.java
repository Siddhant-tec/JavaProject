import java.util.Scanner;

public class Paraser_count_lower_upper {
    public static void main(String[] args) {
        String input;
        Scanner s = new Scanner(System.in);
        input = s.nextLine();

        int n = 0;
        int upper = 0;
        int lower = 0;
        while(n < input.length()){
            //System.out.print(input.charAt(n));
            if(Character.isUpperCase(input.charAt(n))) {
                upper+=1;
            }
            else if(Character.isLowerCase(input.charAt(n))){
                lower += 1;

            }
            n += 1;
        }
        System.out.println("upper: " + upper);
        System.out.println("lower: " + lower);
    }
}
