import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class count_firstocc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        HashMap<Character, Integer> hm = new LinkedHashMap<>();
        for(int i = 0; i<input.length(); i++){
            char ch = input.charAt(i);
            //System.out.println(ch);
            if (hm.containsKey(ch)){
                int p = hm.get(ch);
                p+=1;
                hm.replace(ch, p);
            }
            else{
                hm.put(ch, 1);
            }
        }
        System.out.println(hm);
        for(Character c : hm.keySet()){
            for(int j = 0; j<hm.get(c); j++){
                System.out.print(c);

            }
        }


    }
}
