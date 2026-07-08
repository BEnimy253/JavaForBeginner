package BasicSamplePrograms.VariablesAndDataTypes;

public class sample02 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius = 4.5;

        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

        System.out.println("Ban kinh: " + radius);
        System.out.println("Dien tich hinh tron: " + area);
        System.out.println("Chu vi hinh tron: " + perimeter);
    }
}
