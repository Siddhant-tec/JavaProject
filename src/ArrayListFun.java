import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListFun {
    public static void main(String[] args){
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("John");
        nameList.add("Micheal");
        nameList.add("Jim");

        nameList.add("Dwight");
        nameList.add("Pam");
        nameList.add("Angela");
        nameList.forEach((n) -> System.out.println(n));
        System.out.println();

        nameList.sort(String::compareToIgnoreCase);

        for(String name: nameList){
            System.out.println(name);
        }
        System.out.println();
        Collections.reverse(nameList);
        for(String name: nameList){
            System.out.println(name);
        }

    }
}
