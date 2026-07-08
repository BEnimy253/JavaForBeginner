package StudentManagementProgram.pack04;

public class Student {
    private String maHS;
    private String hoTen;
    private String ngaySinh;
    private String lopHoc;
    private String nganhHoc;

    public Student(String maHS, String hoTen, String ngaySinh, String lopHoc, String nganhHoc) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lopHoc = lopHoc;
        this.nganhHoc = nganhHoc;
    }

    public static void inTenChuongTrinh() {
        System.out.println("Chương trình quản lý học sinh");
    }

    public static String dinhDangMaHS(String maHS) {
        return "HS-" + maHS;
    }

    public void inThongTin() {
        System.out.println(taoDongThongTin());
    }

    public String taoDongThongTin() {
        return dinhDangMaHS(maHS) + " - " + hoTen + " - " + lopHoc + " - " + nganhHoc;
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
