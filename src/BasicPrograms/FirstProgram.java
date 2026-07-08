package BasicPrograms;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        // Chương trình Java đầu tiên
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        System.out.println("Xin chào, " + name + "!");

        scanner.close();
    }
}
