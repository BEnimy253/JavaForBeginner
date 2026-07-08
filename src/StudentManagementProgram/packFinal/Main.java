package StudentManagementProgram.packFinal;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();

        Student student01 = new Student(
                "260001",
                "Nguyễn Văn A",
                "01/01/2010",
                "26UD01",
                "Công nghệ thông tin (Ứng dụng phần mềm)",
                createCongNgheThongTinScores()
        );

        Student student02 = new Student(
                "260002",
                "Trần Thị B",
                "15/03/2010",
                "26SD01",
                "Tạo mẫu và chăm sóc sắc đẹp",
                createChamSocSacDepScores()
        );

        Student student03 = new Student(
                "260003",
                "Lê Văn C",
                "20/07/2010",
                "26UD01",
                "Công nghệ thông tin (Ứng dụng phần mềm)",
                createCongNgheThongTinScores()
        );

        management.addStudent(student01);
        management.addStudent(student02);
        management.addStudent(student03);

        management.updateStudentName("260001", "Nguyễn Văn An");
        management.deleteStudent("260003");

        System.out.println("DANH SÁCH HỌC SINH SAU KHI CẬP NHẬT");
        management.printStudents();
    }

    private static SubjectScore[] createCongNgheThongTinScores() {
        return new SubjectScore[] {
                new SubjectScore("Pháp luật", 7, 8),
                new SubjectScore("Chính trị", 6, 7),
                new SubjectScore("Lập trình Java", 8, 8),
                new SubjectScore("Cơ sở dữ liệu", 7, 6),
                new SubjectScore("Thiết kế Web", 9, 8)
        };
    }

    private static SubjectScore[] createChamSocSacDepScores() {
        return new SubjectScore[] {
                new SubjectScore("Pháp luật", 6, 6),
                new SubjectScore("Chính trị", 7, 7),
                new SubjectScore("Chăm sóc da", 8, 9),
                new SubjectScore("Trang điểm cơ bản", 7, 8),
                new SubjectScore("Tạo mẫu tóc", 6, 8)
        };
    }
}
