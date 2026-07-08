package StudentManagementProgram.packFinal;

public class StudentManagement {
    private Student[] students = new Student[20];
    private int studentCount = 0;

    public void addStudent(Student student) {
        students[studentCount] = student;
        studentCount++;
    }

    public void updateStudentName(String maHS, String hoTenMoi) {
        int index = findIndexByMaHS(maHS);
        students[index].setHoTen(hoTenMoi);
    }

    public void deleteStudent(String maHS) {
        int index = findIndexByMaHS(maHS);

        for (int i = index; i < studentCount - 1; i++) {
            students[i] = students[i + 1];
        }

        students[studentCount - 1] = null;
        studentCount--;
    }

    public void printStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println();
            students[i].printInfo();
        }
    }

    private int findIndexByMaHS(String maHS) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getMaHS().equals(maHS)) {
                return i;
            }
        }

        return -1;
    }
}
