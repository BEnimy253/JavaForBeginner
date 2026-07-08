package BasicSamplePrograms.Branch;

import java.util.Scanner;

public class sample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem trung binh: ");
        double averageScore = scanner.nextDouble();

        if (averageScore >= 5.0) {
            System.out.println("Ket qua: Dat");
        } else {
            System.out.println("Ket qua: Chua dat");
        }

        scanner.close();
    }
}
