package StudentManagementProgram.pack02;

public class Student {
    public String maHS;
    public String hoTen;
    public String ngaySinh;
    public String lopHoc;
    public String nganhHoc;

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
}
