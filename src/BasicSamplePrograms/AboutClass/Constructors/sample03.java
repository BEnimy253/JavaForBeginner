package BasicSamplePrograms.AboutClass.Constructors;

public class sample03 {
    static class Student {
        String fullName;
        int age;
        double score;

        Student() {
            this("Chua co ten", 18, 0.0);
        }

        Student(String fullName) {
            this(fullName, 18, 0.0);
        }

        Student(String fullName, int age, double score) {
            this.fullName = fullName;
            this.age = age;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Student first = new Student();
        Student second = new Student("Le Chi");
        Student third = new Student("Pham Dung", 21, 8.2);

        System.out.println(first.fullName + " - " + first.age + " - " + first.score);
        System.out.println(second.fullName + " - " + second.age + " - " + second.score);
        System.out.println(third.fullName + " - " + third.age + " - " + third.score);
    }
}
