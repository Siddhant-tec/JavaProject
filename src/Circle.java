public class Circle {
    private double radius;


    public Circle(){
        this.radius = 1;

    }
    public Circle(double radius){
        this.radius = radius;

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;

    }

    public double Circumference(){
        return 2 * (Math.PI) * radius;
    }

    public double Area(){
        return  3.14 * Math.pow(radius, 2);
    }

}

class CircleDemo{
    public static void main(String[] args) {
        Circle c = new Circle(4.5);
        System.out.println("r = " + String.format("%.2f", c.getRadius()));
        System.out.println("a = " + String.format("%.2f",c.Area()));
        System.out.println("c = " + String.format("%.2f",c.Circumference()));
    }
}