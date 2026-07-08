package StudentManagementProgram.packFinal;

public class Student extends Person {
    private String maHS;
    private String lopHoc;
    private String nganhHoc;
    private SubjectScore[] subjectScores;

    public Student(String maHS, String hoTen, String ngaySinh, String lopHoc, String nganhHoc,
                   SubjectScore[] subjectScores) {
        super(hoTen, ngaySinh);
        this.maHS = maHS;
        this.lopHoc = lopHoc;
        this.nganhHoc = nganhHoc;
        this.subjectScores = subjectScores;
    }

    public String getMaHS() {
        return maHS;
    }

    @Override
    public void printInfo() {
        System.out.println("Mã học sinh: " + maHS);
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Ngày sinh: " + getNgaySinh());
        System.out.println("Lớp học: " + lopHoc);
        System.out.println("Ngành học: " + nganhHoc);
        System.out.println("Điểm từng môn:");

        for (SubjectScore subjectScore : subjectScores) {
            System.out.println("  - " + subjectScore.getDongThongTin());
        }
    }
}
