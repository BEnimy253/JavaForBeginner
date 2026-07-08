package BasicSamplePrograms.AboutClass.Inheritance;

public class sample01 {
    static class Person {
        String fullName;

        void introduce() {
            System.out.println("Toi la " + fullName);
        }
    }

    static class Student extends Person {
        String studentId;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.fullName = "Lam Phuong";
        student.studentId = "SV010";

        student.introduce();
        System.out.println("Ma sinh vien: " + student.studentId);
    }
}
