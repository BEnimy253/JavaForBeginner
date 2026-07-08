package BasicSamplePrograms.AboutClass.DeclarationAndFields;

public class sample01 {
    static class Student {
        String id;
        String fullName;
        double score;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.id = "SV001";
        student.fullName = "Nguyen An";
        student.score = 8.5;

        System.out.println("Ma: " + student.id);
        System.out.println("Ho ten: " + student.fullName);
        System.out.println("Diem: " + student.score);
    }
}
