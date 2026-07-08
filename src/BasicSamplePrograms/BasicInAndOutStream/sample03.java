package BasicSamplePrograms.BasicInAndOutStream;

import java.util.Scanner;

public class sample03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        String studentId = scanner.nextLine();

        System.out.print("Nhap ho ten: ");
        String fullName = scanner.nextLine();

        System.out.print("Nhap diem Java: ");
        double javaScore = scanner.nextDouble();

        System.out.println("Thong tin vua nhap:");
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Ho ten: " + fullName);
        System.out.print("Diem Java: ");
        System.out.println(javaScore);

        scanner.close();
    }
}
