package StudentManagementProgram.pack03;

public class Student {
    private String maHS;
    private String hoTen;
    private String ngaySinh;
    private String lopHoc;
    private String nganhHoc;

    public Student() {
        maHS = "260001";
        hoTen = "Nguyễn Văn A";
        ngaySinh = "01/01/2010";
        lopHoc = "26UD01";
        nganhHoc = "Công nghệ thông tin (Ứng dụng công nghệ)";
    }

    public Student(String maHS, String hoTen, String ngaySinh, String lopHoc, String nganhHoc) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lopHoc = lopHoc;
        this.nganhHoc = nganhHoc;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
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

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }
}
