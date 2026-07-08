package StudentManagementProgram.pack08;

public class Teacher extends Person implements Printable {
    private String monDay;

    public Teacher(String hoTen, String ngaySinh, String monDay) {
        super(hoTen, ngaySinh);
        this.monDay = monDay;
    }

    @Override
    public void printInfo() {
        System.out.println("Teacher: " + hoTen + " - " + monDay);
    }
}
