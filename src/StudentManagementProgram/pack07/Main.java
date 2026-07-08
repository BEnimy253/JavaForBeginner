package StudentManagementProgram.pack07;

public class Main {
    public static void main(String[] args) {
        Person student = new Student("260001", "Nguyễn Văn A", "01/01/2010");
        Person teacher = new Teacher("Trần Thị B", "12/05/1990", "Chính trị");

        student.inThongTinCoBan();
        teacher.inThongTinCoBan();
    }
}
