import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleList = new ArrayList<>();
        fillRectangle(rectangleList);
        printRectangle(rectangleList);

    }

    public static void fillRectangle(ArrayList<Rectangle> rectangleAL){
        Scanner inFile;
        try {
            inFile = new Scanner(new File("rectangle_data.txt"));
            Rectangle temp;
            double length;
            double width;

            while (inFile.hasNext()){
                length = inFile.nextDouble();
                width = inFile.nextDouble();
                temp = new Rectangle(length, width);
                rectangleAL.add(temp);

            }

        }
        catch (FileNotFoundException ex){
            System.out.println("File not Found!");
        }


    }

    public static void printRectangle(ArrayList<Rectangle> rectangleAL){
        for(Rectangle r : rectangleAL){
            System.out.println("Area = " + r.Area());
            System.out.println("Perimeter = " + r.Perimeter());
            System.out.println();
        }
    }
}
