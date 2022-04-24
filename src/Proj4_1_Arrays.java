import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args){
        int[] array = new int[5];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            array[i] = s.nextInt();

        }
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j] * 2);
        }
    }

}
