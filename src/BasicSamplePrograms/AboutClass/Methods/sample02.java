package BasicSamplePrograms.AboutClass.Methods;

public class sample02 {
    static class Rectangle {
        double width;
        double height;

        double getArea() {
            return width * height;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 4.0;
        rectangle.height = 3.0;

        System.out.println("Dien tich = " + rectangle.getArea());
    }
}
