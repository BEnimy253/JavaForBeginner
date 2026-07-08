package BasicSamplePrograms.AboutClass.AccessModifiers;

public class sample03 {
    static class Person {
        protected String fullName;

        protected void introduce() {
            System.out.println("Toi la " + fullName);
        }
    }

    static class Student extends Person {
        void printIntroduction() {
            introduce();
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.fullName = "Kieu Minh";
        student.printIntroduction();
    }
}
