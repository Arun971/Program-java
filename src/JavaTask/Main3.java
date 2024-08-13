package JavaTask;
// Shape.java
interface Shapess {
    double getArea();
}

// Rectangle.java
class Rectangl implements Shapess {
    private double width;
    private double height;

    public Rectangl(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// Circle.java
class Circles implements Shapess {
    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle.java
class Triangl implements Shapess {
    private double base;
    private double height;

    public Triangl(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main.java
public class  Main3{
    public static void main(String[] args) {
        Shapess rectangle = new Rectangl(5, 10);
        Shapess circle = new Circles(7);
        Shapess triangle = new Triangl(6, 8);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());
    }

}
