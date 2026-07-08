package StudentManagementProgram.pack07;

public abstract class Person {
    protected String hoTen;
    protected String ngaySinh;

    public Person(String hoTen, String ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public abstract String getVaiTro();

    public void inThongTinCoBan() {
        System.out.println(getVaiTro() + ": " + hoTen + " - " + ngaySinh);
    }
}
