package BasicSamplePrograms.Jump;

import java.util.Scanner;

public class sample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma xep loai (A, B, C, D): ");
        char level = scanner.nextLine().toUpperCase().charAt(0);

        switch (level) {
            case 'A':
            case 'B':
                System.out.println("Ket qua tot.");
                break;
            case 'C':
                System.out.println("Ket qua trung binh.");
                break;
            case 'D':
                System.out.println("Can co gang hon.");
                break;
            default:
                System.out.println("Ma xep loai khong hop le.");
        }

        scanner.close();
    }
}
