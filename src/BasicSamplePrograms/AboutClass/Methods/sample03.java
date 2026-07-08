package BasicSamplePrograms.AboutClass.Methods;

public class sample03 {
    static class GradeBook {
        void printTitle() {
            System.out.println("Bang diem mon Java");
        }

        double calculateAverage(double firstScore, double secondScore) {
            return (firstScore + secondScore) / 2;
        }
    }

    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();
        gradeBook.printTitle();

        double average = gradeBook.calculateAverage(8.0, 9.0);
        System.out.println("Diem trung binh = " + average);
    }
}
