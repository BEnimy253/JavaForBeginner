package BasicSamplePrograms.BasicInAndOutStream;

import java.util.Scanner;

public class sample01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String name = scanner.nextLine();

        System.out.print("Nhap tuoi cua ban: ");
        int age = scanner.nextInt();

        System.out.println("Xin chao " + name + "!");
        System.out.println("Nam sau ban se " + (age + 1) + " tuoi.");

        scanner.close();
    }
}
