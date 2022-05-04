import java.util.ArrayList;
import java.util.Scanner;

public class StringConcatLambda {
    public static void main(String[] args) {
        String a1;
        String a2;
        Scanner s = new Scanner(System.in);
        a1 = s.nextLine();
        a2 = s.nextLine();
        ArrayList<String> ls = new ArrayList<>();
        ls.add(a1);
        ls.add(a2);
        StringBuilder sb = new StringBuilder();
        ls.forEach(c -> sb.append(c));
        System.out.println(sb);
    }
}
