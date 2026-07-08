package BasicSamplePrograms.AboutClass.AccessModifiers;

public class sample01 {
    static class Student {
        public String fullName;
        private double score;

        public void setScore(double score) {
            this.score = score;
        }

        public double getScore() {
            return score;
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.fullName = "Hoang Lam";
        student.setScore(7.5);

        System.out.println(student.fullName + " - " + student.getScore());
    }
}
