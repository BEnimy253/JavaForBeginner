package BasicSamplePrograms.Loop.WhileLoop;

import java.util.Scanner;

public class sample03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "";

        while (!password.equals("java123")) {
            System.out.print("Nhap mat khau: ");
            password = scanner.nextLine();
        }

        System.out.println("Dang nhap thanh cong.");

        scanner.close();
    }
}
