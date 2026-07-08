package BasicSamplePrograms.ExceptionProcessing;

import java.util.Scanner;

public class sample03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhap so nguyen: ");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("So vua nhap: " + number);
        } catch (NumberFormatException exception) {
            System.out.println("Du lieu nhap khong phai so nguyen.");
        } finally {
            System.out.println("Khoi finally luon duoc thuc hien.");
            scanner.close();
        }
    }
}
