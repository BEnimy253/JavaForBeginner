package BasicSamplePrograms.Loop.ForLoop;

import java.util.Scanner;

public class sample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Tong tu 1 den " + n + " = " + sum);

        scanner.close();
    }
}
