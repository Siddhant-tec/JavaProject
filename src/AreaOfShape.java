import java.util.Scanner;

public class AreaOfShape {
    protected double area;

    public void computeArea(){
        this.area = 0;
    }


}

class CircleT extends AreaOfShape {
    private double radius;
    public CircleT(double radius){
        this.radius = radius;
    }

    @Override
    public void computeArea() {
        super.computeArea();
        area = (3.14)*Math.pow(radius , 2);
        System.out.println(String.format("%.2f",area));

    }
}

class RectangleT extends AreaOfShape{
    private double length;
    private double breadth;

    public RectangleT(double length, double breadth){
        this.length = breadth;
        this.breadth = length;

    }


    @Override
    public void computeArea() {
        super.computeArea();
        area = length * breadth;
        System.out.println(String.format("%.2f",area));

    }
}

class TriangleT extends AreaOfShape{
    private double base;
    private double height;

    public TriangleT(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public void computeArea() {
        super.computeArea();
        area = (height * base)/2;
        System.out.println(String.format("%.2f",area));

    }
}

class AreaDriver {
    public static void main(String[] args) {
        AreaOfShape a = new AreaOfShape();
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if(input == 1){
            double r = s.nextDouble();
            CircleT c = new CircleT(r);
            c.computeArea();
        }
        if ( input == 2){
            double length = s.nextDouble();
            double breadth = s.nextDouble();
            RectangleT r = new RectangleT(length, breadth);
            r.computeArea();
        }
        if (input == 3){
            double height = s.nextDouble();
            double base = s.nextDouble();
            TriangleT t = new TriangleT(base, height);
            t.computeArea();

        }
    }
}