package BasicSamplePrograms.AboutClass.Inheritance;

public class sample03 {
    static class Teacher {
        void teach() {
            System.out.println("Giao vien dang giang bai.");
        }

        void teach(String topic) {
            System.out.println("Giao vien dang giang bai: " + topic);
        }
    }

    static class JavaTeacher extends Teacher {
        @Override
        void teach() {
            System.out.println("Giao vien Java dang huong dan lap trinh.");
        }
    }

    public static void main(String[] args) {
        JavaTeacher teacher = new JavaTeacher();
        teacher.teach();
        teacher.teach("overload va override");
    }
}
