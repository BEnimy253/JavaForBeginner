package StudentManagementProgram.pack06;

public class Teacher extends Person {
    private String monDay;

    public Teacher(String hoTen, String ngaySinh, String monDay) {
        super(hoTen, ngaySinh);
        this.monDay = monDay;
    }

    @Override
    public void inThongTin() {
        System.out.println("Teacher: " + hoTen + " - " + monDay);
    }
}
