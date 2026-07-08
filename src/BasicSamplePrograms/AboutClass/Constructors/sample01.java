package BasicSamplePrograms.AboutClass.Constructors;

public class sample01 {
    static class Student {
        String fullName;

        Student() {
            fullName = "Chua co ten";
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Ho ten: " + student.fullName);
    }
}
