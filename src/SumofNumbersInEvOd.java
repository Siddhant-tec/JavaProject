import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

interface sumOf{
     void maxSum(ArrayList<Integer> numList);
}


public class SumofNumbersInEvOd implements sumOf {
    @Override
    public void maxSum(ArrayList<Integer> numList) {
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i<numList.size(); i++){
            if(i%2 == 0){
                evenSum += numList.get(i);
            }
            else {
                oddSum += numList.get(i);
            }
        }
        if(evenSum > oddSum){
            for(int i = 0; i<numList.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(numList.get(i) + " ");
                }
            }
        }
        else {
            for(int i = 0; i < numList.size(); i++){
                if(i%2 != 0){
                    System.out.println(numList.get(i) + " ");
                }
            }
        }

    }
}

class maxSumDemo{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        int input = s.nextInt();
        s.nextLine();
        while(input > 0){
            numList.add(s.nextInt());
            input-=1;
        }
        if(input % 2 == 0){
            SumofNumbersInEvOd eo = new SumofNumbersInEvOd();
            eo.maxSum(numList);
        }
        else{
            System.out.println("Enter valid number");
        }


    }
}
