import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverse_2d_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 2;

        int[][] a = new int[2][2];
        for(int i = 0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            int tmp = a[0][i];
            a[0][i] = a[1][i];
            a[1][i] = tmp;
        }

        //reversing columns
        for (int i = 0; i < 2; i++) {
            int tmp = a[i][0];
            a[i][0] = a[i][1];
            a[i][1] = tmp;
        }
        for(int[] arr: a){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }


    }
