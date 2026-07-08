package StudentManagementProgram.pack01;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Mã học sinh: " + student.maHS);
        System.out.println("Họ tên: " + student.hoTen);
        System.out.println("Ngày sinh: " + student.ngaySinh);
        System.out.println("Lớp học: " + student.lopHoc);
        System.out.println("Ngành học: " + student.nganhHoc);
    }
}
