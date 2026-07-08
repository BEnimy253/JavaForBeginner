package BasicSamplePrograms.AboutClass.DeclarationAndFields;

public class sample03 {
    static class Course {
        static String schoolName = "Trung tam Java";
        String name;
        int credits;
    }

    public static void main(String[] args) {
        Course javaBasic = new Course();
        javaBasic.name = "Java Basic";
        javaBasic.credits = 3;

        Course database = new Course();
        database.name = "Database";
        database.credits = 2;

        System.out.println(Course.schoolName);
        System.out.println(javaBasic.name + " - " + javaBasic.credits + " tin chi");
        System.out.println(database.name + " - " + database.credits + " tin chi");
    }
}
