import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner inFile;
        int sum = 0;
        try{
            inFile = new Scanner(new File("input.txt"));
            int input;
            while (inFile.hasNext()){
                input = inFile.nextInt();
                sum += input;
                System.out.println(input);
            }
            System.out.println("Sum is: " + sum);
            inFile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Can't Find the File!");
            System.out.println(ex.getMessage());
        }
        catch (InputMismatchException in){
            System.out.println("Error Reading the File!");
        }
    }

}
