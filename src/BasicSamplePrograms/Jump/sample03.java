package BasicSamplePrograms.Jump;

import java.util.Scanner;

public class sample03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap thang trong nam: ");
        int month = scanner.nextInt();

        String season = switch (month) {
            case 1, 2, 3 -> "Mua xuan";
            case 4, 5, 6 -> "Mua he";
            case 7, 8, 9 -> "Mua thu";
            case 10, 11, 12 -> "Mua dong";
            default -> "Thang khong hop le";
        };

        System.out.println("Ket qua: " + season);

        scanner.close();
    }
}
