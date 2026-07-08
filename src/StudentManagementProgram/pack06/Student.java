package StudentManagementProgram.pack06;

public class Student extends Person {
    private String maHS;
    private String lopHoc;

    public Student(String maHS, String hoTen, String ngaySinh, String lopHoc) {
        super(hoTen, ngaySinh);
        this.maHS = maHS;
        this.lopHoc = lopHoc;
    }

    @Override
    public void inThongTin() {
        System.out.println("Student: " + maHS + " - " + hoTen + " - " + lopHoc);
    }
}
