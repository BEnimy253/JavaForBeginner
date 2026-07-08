package StudentManagementProgram.pack07;

public class Teacher extends Person {
    private String monDay;

    public Teacher(String hoTen, String ngaySinh, String monDay) {
        super(hoTen, ngaySinh);
        this.monDay = monDay;
    }

    @Override
    public String getVaiTro() {
        return "Giáo viên môn " + monDay;
    }
}
