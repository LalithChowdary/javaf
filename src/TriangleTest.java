import java.util.Scanner;

class Triangle {
    private double side1, side2, side3;

    Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4, 5, 6);
        Triangle t2 = new Triangle(1.5, 2.5, 3.5);

        System.out.println("The area of the first triangle is " + t1.getArea());
        System.out.println("Perimeter of the first triangle is " + t1.getPerimeter());
        System.out.println("The area of the second triangle is " + t2.getArea());
        System.out.println("Perimeter of the second triangle is " + t2.getPerimeter());
    }
}
