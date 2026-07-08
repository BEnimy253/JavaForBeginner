package BasicSamplePrograms.BasicInAndOutStream;

import java.util.Scanner;

public class sample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double average = sum / 2;

        System.out.println("Tong = " + sum);
        System.out.println("Trung binh = " + average);

        scanner.close();
    }
}
