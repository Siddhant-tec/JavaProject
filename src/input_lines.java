import java.util.Scanner;

public class input_lines {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        String input = s.nextLine();
        while (!input.equals("q")){
            input = s.nextLine();
            count += 1;
        }
        System.out.println(count);
    }
}
