package BasicSamplePrograms.Loop.DoWhileLoop;

import java.util.Scanner;

public class sample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        do {
            System.out.print("Nhap diem tu 0 den 10: ");
            score = scanner.nextInt();
        } while (score < 0 || score > 10);

        System.out.println("Diem hop le: " + score);

        scanner.close();
    }
}
