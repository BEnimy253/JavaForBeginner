package BasicSamplePrograms.Loop.DoWhileLoop;

import java.util.Scanner;

public class sample03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Xem loi chao");
            System.out.println("2. Thoat");
            System.out.print("Chon: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Xin chao ban den voi Java!");
            }
        } while (choice != 2);

        System.out.println("Ket thuc chuong trinh.");

        scanner.close();
    }
}
