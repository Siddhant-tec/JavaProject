import java.util.Arrays;
import java.util.Scanner;

public class group_similar_people {
    public static void main(String[] args) {
        String sentence;
        Scanner s = new Scanner(System.in);

        sentence = s.nextLine();
        char[] characters = sentence.toCharArray();
        Arrays.sort(characters);
        System.out.println(characters);
    }
}
