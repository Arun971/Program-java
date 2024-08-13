package JavaTask;

import org.w3c.dom.ls.LSOutput;

interface  Car{
    double getArea();
}
class  Square implements Car{
    private double width;
    private double height;

    public Square(double width, double height) {
      this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
}
class Circless implements Car{
    private double radius;

    public Circless(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI* radius* radius;
    }
}
class Triangless implements Car{
    private double base;
    private double height;

    public Triangless(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return 0.5 * base* height;
    }
}
public class Shapes {
    public static void main(String[] args) {

        Car square = new Square(5, 10);
        Car circless = new Circless(7);
        Car triangless = new Triangless(6, 8);
        System.out.println("Square Area "+ square.getArea());
        System.out.println("Circless Area "+ circless.getArea());
        System.out.println("Triangles Area : "+ triangless.getArea());
    }
}