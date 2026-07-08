package StudentManagementProgram.pack08;

public class Student extends Person implements Printable {
    private String maHS;
    private String lopHoc;

    public Student(String maHS, String hoTen, String ngaySinh, String lopHoc) {
        super(hoTen, ngaySinh);
        this.maHS = maHS;
        this.lopHoc = lopHoc;
    }

    @Override
    public void printInfo() {
        System.out.println("Student: " + maHS + " - " + hoTen + " - " + lopHoc);
    }
}
