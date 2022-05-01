import java.util.Scanner;

public class NameParser {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String fullName = s.nextLine();

        int space = fullName.indexOf(" ");

        String firstName = fullName.substring(0, space + 1);
        String lastName = fullName.substring(space + 1);

        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toUpperCase());
    }
}
