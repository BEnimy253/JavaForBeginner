package BasicSamplePrograms.AboutClass.Inheritance;

public class sample02 {
    static class Person {
        String fullName;

        Person(String fullName) {
            this.fullName = fullName;
        }
    }

    static class Student extends Person {
        String major;

        Student(String fullName, String major) {
            super(fullName);
            this.major = major;
        }

        void printInfo() {
            System.out.println("Ho ten: " + this.fullName);
            System.out.println("Nganh hoc: " + this.major);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Minh Quan", "Cong nghe thong tin");
        student.printInfo();
    }
}
