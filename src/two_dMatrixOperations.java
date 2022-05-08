import java.util.Scanner;
class Matrix{
    int[][] mat;
    public Matrix(int[][] mat){
        this.mat = mat;
    }

    public void display(){
        for(int[] arr: mat){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    public void Diagonal(){
        int n = mat.length;
        int maxp = mat[0][0];
        int maxs = mat[0][0];
        int minp = mat[n-1][0];
        int mins = mat[n-1][0];

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                if( i == j){
                    if(mat[i][j] < minp){
                        minp = mat[i][j];
                    }
                    if(mat[i][j] > maxp){
                        maxp = mat[i][j];
                    }
                }
                if ( i + j == n -1){
                    if(mat[i][j] < mins){
                        mins = mat[i][j];
                    }
                    if(mat[i][j] > maxs){
                        maxs = mat[i][j];
                    }
                }
            }
        }
        System.out.println("Max Min Diagonal p : " + maxp +" "+ minp);
        System.out.println("Max min Diagonal s : " + maxs + " " + mins);

    }

}
public class two_dMatrixOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n ; j++){
                a[i][j] = s.nextInt();
            }
        }
        Matrix m = new Matrix(a);
        m.display();
        m.Diagonal();
        //m.display();


    }
}
