import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner read;
        PrintWriter pw;
        try {
            read = new Scanner(new File("nums.txt"));
            pw = new PrintWriter("twice_nums.txt");
            int num;
            while (read.hasNext()){
                num = read.nextInt();
                num *= 2;
                pw.println(num);
            }
            read.close();
            pw.close();

        }
        catch (FileNotFoundException ex){
            System.out.println("File not Found!");
        }
    }
}
