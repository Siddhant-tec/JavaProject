import java.util.ArrayList;
import java.util.Scanner;

public class Proj_4_2_Array_Lists {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Double> myList= new ArrayList<>();
        double input = s.nextDouble();
        while (input > 0){
            myList.add(input);
            input = s.nextDouble();
            }
        System.out.println(myList);
        for(int i = myList.size() - 1; i >= 0; i-- ) {
            System.out.println(myList.get(i));

        }

        }


    }

