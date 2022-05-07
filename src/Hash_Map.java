import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("John", 1);
        hm.put("Micheal", 2);
        hm.put("Jim", 3);
        hm.put("Pam", 4);


        System.out.println(hm);
        for (Map.Entry<String, Integer> e : hm.entrySet()){
            System.out.println("KEy: " + e.getKey());
            System.out.println("Value: " + e.getValue());
            System.out.println();
        }

        for(String s : hm.keySet()){
            System.out.println(s);
        }

        for(Integer i : hm.values()){
            System.out.println(i);
        }
        //System.out.println(hm.get("John"));
    }
}
