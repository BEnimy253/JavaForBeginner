package BasicSamplePrograms.AboutClass.Abstract;

public class sample03 {
    static abstract class Shape {
        abstract double getArea();
    }

    static class Square extends Shape {
        double side;

        Square(double side) {
            this.side = side;
        }

        @Override
        double getArea() {
            return side * side;
        }
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = {new Square(4), new Circle(3)};

        for (Shape shape : shapes) {
            System.out.println("Dien tich = " + shape.getArea());
        }
    }
}
