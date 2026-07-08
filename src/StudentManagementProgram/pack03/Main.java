package StudentManagementProgram.pack03;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Thông tin ban đầu:");
        System.out.println(student.getMaHS() + " - " + student.getHoTen());

        student.setHoTen("Nguyễn Văn Bình");
        student.setLopHoc("26UD01");

        System.out.println("Thông tin sau khi cập nhật:");
        System.out.println(student.getMaHS() + " - " + student.getHoTen() + " - " + student.getLopHoc());
    }
}
