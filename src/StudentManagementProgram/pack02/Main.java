package StudentManagementProgram.pack02;

public class Main {
    public static void main(String[] args) {
        Student defaultStudent = new Student();
        Student customStudent = new Student(
                "260002",
                "Trần Thị B",
                "15/03/2010",
                "26SD01",
                "Tạo mẫu và chăm sóc sắc đẹp"
        );

        System.out.println("Học sinh tạo bằng constructor mặc định:");
        System.out.println(defaultStudent.maHS + " - " + defaultStudent.hoTen);

        System.out.println("Học sinh tạo bằng constructor có tham số:");
        System.out.println(customStudent.maHS + " - " + customStudent.hoTen);
    }
}
