import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class WriterNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("Siddhant");
        names.add("Ashish");
        names.add("Mansiha");
        names.add("Dwigth");
        names.add("Micheal");
        names.add("Pam");
        names.add("Jim");

        try {
            PrintWriter pw = new PrintWriter("output.txt");
            for(String name : names){
                pw.println(name);
            }
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not Found!");
        }



    }
}
