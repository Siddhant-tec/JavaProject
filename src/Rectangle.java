public class Rectangle {
    private double length;
    private double width;

    private static int numRectangles;

    public Rectangle(){
        this(1.0, 1.0);

    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        numRectangles++;

    }
    public double getWidth(double width){
        return width;
    }

    public double getLength(double length){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double Area(){
        return (length * width);
    }

    public double Perimeter(){
        return  2 * (length + width);
    }

    public static int getNumRectangles(){
        return numRectangles;
    }

}

class RectangleDemo{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 5);
        System.out.println(Rectangle.getNumRectangles());
        Rectangle r3;
        System.out.println("After r3 declared: " + Rectangle.getNumRectangles());
        r3 = new Rectangle(5.5, 12.5);

        System.out.println("After r3 instatiated: " + Rectangle.getNumRectangles());


        System.out.println(r1.Area());
        System.out.println(r2.Area());
        System.out.println(r3.Area());
        System.out.println(r1.Perimeter());
        System.out.println(r2.Perimeter());
        System.out.println(r3.Perimeter());



    }
}