package StudentManagementProgram.pack09;

public class StudentManagement {
    private Student[] students = new Student[10];
    private int studentCount = 0;

    public void addStudent(Student student) {
        students[studentCount] = student;
        studentCount++;
    }

    public void updateStudentName(String maHS, String hoTenMoi) {
        Student student = findStudentByMaHS(maHS);
        student.setHoTen(hoTenMoi);
    }

    public void printStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getDongThongTin());
        }
    }

    private Student findStudentByMaHS(String maHS) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getMaHS().equals(maHS)) {
                return students[i];
            }
        }

        return null;
    }
}
