package StudentManagementProgram.pack04;

public class Main {
    public static void main(String[] args) {
        Student.inTenChuongTrinh();

        Student student = new Student(
                "260001",
                "Nguyễn Văn A",
                "01/01/2010",
                "26UD01",
                "Công nghệ thông tin (Ứng dụng công nghệ)"
        );

        student.inThongTin();

        String line = student.taoDongThongTin();
        System.out.println("Dòng thông tin trả về: " + line);
    }
}
