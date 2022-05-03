import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NameAges {
    public static void main(String[] args) {
        Scanner namesFile;
        Scanner agesFile;
        PrintWriter pw;

        try {
            namesFile = new Scanner(new File("output.txt"));
            agesFile = new Scanner(new File("input.txt"));
            pw = new PrintWriter("names_ages.txt");

            String tempName;
            int tempAge;

            while (namesFile.hasNext()){
                tempName = namesFile.nextLine();
                tempAge = agesFile.nextInt();
                pw.println(tempName + " is " + tempAge + " years old");
            }


            namesFile.close();
            agesFile.close();
            pw.close();

        }
        catch (FileNotFoundException ex){
            System.out.println("File not Found !");

        }
    }
}
