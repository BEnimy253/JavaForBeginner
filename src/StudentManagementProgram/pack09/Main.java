package StudentManagementProgram.pack09;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();

        management.addStudent(new Student(
                "260001",
                "Nguyễn Văn A",
                "26UD01",
                "Công nghệ thông tin (Ứng dụng công nghệ)",
                7,
                8
        ));

        management.updateStudentName("260001", "Nguyễn Văn An");
        management.printStudents();
    }
}
