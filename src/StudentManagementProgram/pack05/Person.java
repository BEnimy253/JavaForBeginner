package StudentManagementProgram.pack05;

public class Person {
    protected String hoTen;
    protected String ngaySinh;

    public Person(String hoTen, String ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public String getThongTinCoBan() {
        return hoTen + " - " + ngaySinh;
    }
}
