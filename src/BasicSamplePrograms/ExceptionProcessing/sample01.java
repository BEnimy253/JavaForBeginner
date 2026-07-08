package BasicSamplePrograms.ExceptionProcessing;

import java.util.Scanner;

public class sample01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhap tu so: ");
            int numerator = scanner.nextInt();

            System.out.print("Nhap mau so: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Ket qua = " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Khong the chia cho 0.");
        }

        scanner.close();
    }
}
