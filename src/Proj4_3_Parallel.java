import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] Args){
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
        Scanner a = new Scanner(System.in);
        //Scanner n = new Scanner(System.in);
        String name;
        int age;

        int i = 5;
        while(i > 0){
            System.out.println("Enter name: ");
            name = a.nextLine();
            nameList.add(name);

            System.out.println("Enter age: ");
            age = a.nextInt();
            ageList.add(age);

            a.nextLine();

            i -= 1;
        }

        for(int j = 0; j < ageList.size(); j++){
                System.out.println(nameList.get(j) + " age is " + ageList.get(j));
        }

    }
}
