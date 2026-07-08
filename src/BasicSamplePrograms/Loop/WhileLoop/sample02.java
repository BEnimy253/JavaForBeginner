package BasicSamplePrograms.Loop.WhileLoop;

import java.util.Scanner;

public class sample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Nhap so nguyen (0 de dung): ");
        int number = scanner.nextInt();

        while (number != 0) {
            sum += number;
            System.out.print("Nhap so nguyen (0 de dung): ");
            number = scanner.nextInt();
        }

        System.out.println("Tong cac so da nhap = " + sum);

        scanner.close();
    }
}
