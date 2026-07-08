package BasicSamplePrograms.Branch;

import java.util.Scanner;

public class sample01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("So vua nhap la so duong.");
        }

        if (number % 2 == 0) {
            System.out.println("So vua nhap la so chan.");
        }

        scanner.close();
    }
}
