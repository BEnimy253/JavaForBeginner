package StudentManagementProgram.packFinal;

public abstract class Person implements Printable {
    private String hoTen;
    private String ngaySinh;

    public Person(String hoTen, String ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }
}
