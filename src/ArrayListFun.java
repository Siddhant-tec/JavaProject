import java.util.ArrayList;
public class ArrayListFun {
    public static void main(String[] args){
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("John");
        nameList.add("Micheal");
        nameList.add("Jim");
        nameList.add("Dwight");
        nameList.add("Pam");
        nameList.add("Angela");

        for(String name: nameList){
            System.out.println(name);
        }
    }
}
