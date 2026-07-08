package StudentManagementProgram.pack07;

public class Student extends Person {
    private String maHS;

    public Student(String maHS, String hoTen, String ngaySinh) {
        super(hoTen, ngaySinh);
        this.maHS = maHS;
    }

    @Override
    public String getVaiTro() {
        return "Học sinh " + maHS;
    }
}
