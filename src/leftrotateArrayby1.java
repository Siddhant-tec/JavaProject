import java.lang.reflect.Array;
import java.util.*;

interface rotote{
     void leftR(int[] arr, int d, int n);
}

public class leftrotateArrayby1 implements rotote{
    @Override
    public void leftR(int[] arr, int d, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : arr){
            al.add(i);
        }
        Collections.rotate(al, -1);
        for(int i : al){
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        s.nextLine();
        int[] arr = new int[input];
        for(int i = 0; i < input; i++){
            arr[i] += s.nextInt();
        }
        leftrotateArrayby1 lb = new leftrotateArrayby1();
        lb.leftR(arr, 0, input);


    }
}
