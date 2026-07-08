package BasicSamplePrograms.AboutClass.Constructors;

public class sample02 {
    static class Student {
        String fullName;
        double score;

        Student(String fullName, double score) {
            this.fullName = fullName;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Tran Binh", 9.0);

        System.out.println("Ho ten: " + student.fullName);
        System.out.println("Diem: " + student.score);
    }
}
