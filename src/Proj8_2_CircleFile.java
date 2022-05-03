import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circleList = new ArrayList<>();
        Scanner inFile;
        PrintWriter pw;

        try{
            inFile = new Scanner(new File("circle_data.txt"));
            pw = new PrintWriter("circle_output.txt");
            double radius;
            Circle temp;
            while (inFile.hasNext()){
                radius = inFile.nextDouble();
                temp = new Circle(radius);
                circleList.add(temp);
            }
            for(Circle c : circleList){
                System.out.println(c.Area());
                System.out.println(c.Circumference());
                pw.println("Area : " + c.Area());
                pw.println("Circumference: " + c.Circumference() + "\n");
            }
            inFile.close();
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not Found!");
        }
    }
}
