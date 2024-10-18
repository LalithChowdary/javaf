import java.util.Scanner;

abstract class Shape {
    public abstract double area();
    public abstract double circumference();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double circumference() {
        return 2 * (length + breadth);
    }
}

class Triangle1 extends Shape {
    private double s1, s2, s3;

    public Triangle1(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    @Override
    public double circumference() {
        return s1 + s2 + s3;
    }

    @Override
    public double area() {
        if (isValidTriangle()) {
            double s = (s1 + s2 + s3) / 2;
            return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        } else {
            System.out.println("Invalid triangle sides.");
            return 0;
        }
    }

    private boolean isValidTriangle() {
        return (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = in.nextDouble();
        Shape circle = new Circle(radius);

        System.out.println("Enter length and breadth of Rectangle ");
        double length = in.nextDouble();
        double breadth = in.nextDouble();
        Shape rectangle = new Rectangle(length, breadth);

        System.out.println("Enter the 3 sides of the triangle");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();
        Shape triangle = new Triangle1(side1, side2, side3);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Circumference of Circle: " + circle.circumference());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Circumference of Rectangle: " + rectangle.circumference());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Circumference of Triangle: " + triangle.circumference());
    }
}
