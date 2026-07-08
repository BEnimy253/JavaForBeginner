package BasicPrograms;

public class IfProgram {
    public static void main(String[] args) {
        int age = 18;

        // Ví dụ về if
        if (age >= 18) {
            System.out.println("Bạn đã đủ tuổi trưởng thành.");
        }

        int number = 7;

        // Ví dụ về if...else
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }

        int score = 85;

        // Ví dụ về if...else if...else
        if (score >= 90) {
            System.out.println("Xếp loại: Xuất sắc");
        } else if (score >= 80) {
            System.out.println("Xếp loại: Giỏi");
        } else if (score >= 65) {
            System.out.println("Xếp loại: Khá");
        } else if (score >= 50) {
            System.out.println("Xếp loại: Trung bình");
        } else {
            System.out.println("Xếp loại: Chưa đạt");
        }
    }
}
