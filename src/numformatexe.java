import java.util.Scanner;

public class numformatexe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        try{
            int i = Integer.parseInt(input);
            System.out.println(i);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }

    }
}
