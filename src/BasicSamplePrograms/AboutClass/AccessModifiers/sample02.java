package BasicSamplePrograms.AboutClass.AccessModifiers;

public class sample02 {
    static class Course {
        String name;

        void printName() {
            System.out.println("Mon hoc: " + name);
        }
    }

    public static void main(String[] args) {
        Course course = new Course();
        course.name = "Lap trinh Java";
        course.printName();
    }
}
