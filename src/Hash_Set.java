import java.util.HashSet;
import java.util.Scanner;

public class Hash_Set {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        HashSet<String> hset = new HashSet<>();
        while (n-->0){
            hset.add(s.nextLine());
        }
        String check = s.nextLine();
        if(hset.contains(check)){
            System.out.println(check + " is in the hash set");
        }
        else {
            System.out.println(check + " is not in the hash set");
        }
    }
}
