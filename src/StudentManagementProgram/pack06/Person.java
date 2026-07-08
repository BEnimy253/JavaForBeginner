package StudentManagementProgram.pack06;

public class Person {
    protected String hoTen;
    protected String ngaySinh;

    public Person(String hoTen, String ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public void inThongTin() {
        System.out.println("Person: " + hoTen + " - " + ngaySinh);
    }
}
