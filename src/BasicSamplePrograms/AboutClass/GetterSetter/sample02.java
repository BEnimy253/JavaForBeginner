package BasicSamplePrograms.AboutClass.GetterSetter;

public class sample02 {
    static class Student {
        private double score;

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            if (score >= 0 && score <= 10) {
                this.score = score;
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setScore(8.5);
        student.setScore(12.0);

        System.out.println("Diem hien tai: " + student.getScore());
    }
}
