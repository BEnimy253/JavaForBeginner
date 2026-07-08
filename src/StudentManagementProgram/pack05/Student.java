package StudentManagementProgram.pack05;

public class Student extends Person {
    private String maHS;
    private String lopHoc;
    private String nganhHoc;

    public Student(String maHS, String hoTen, String ngaySinh, String lopHoc, String nganhHoc) {
        super(hoTen, ngaySinh);
        this.maHS = maHS;
        this.lopHoc = lopHoc;
        this.nganhHoc = nganhHoc;
    }

    public void inThongTin() {
        System.out.println(maHS + " - " + getThongTinCoBan() + " - " + lopHoc + " - " + nganhHoc);
    }
}
