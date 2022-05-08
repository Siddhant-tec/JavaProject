import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort_array {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        s.nextLine();
        while (n --> 0){
            al.add(s.nextInt());
        }
        Collections.sort(al);
        for(int i : al) {
            System.out.println(i);
        }
        System.out.println();
        //find first largest and second largest
        System.out.println(Collections.max(al));
        al.remove(Collections.max(al));
        System.out.println(Collections.max(al));
        System.out.println();

        //find 1 and 2 smallest
        System.out.println(Collections.min(al));
        al.remove(Collections.min(al));
        System.out.println(Collections.min(al));

    }
}
