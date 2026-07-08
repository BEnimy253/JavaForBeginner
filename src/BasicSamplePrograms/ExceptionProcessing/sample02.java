package BasicSamplePrograms.ExceptionProcessing;

import java.util.Scanner;

public class sample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"Java", "Database", "Web"};

        try {
            System.out.print("Nhap vi tri mon hoc: ");
            int index = Integer.parseInt(scanner.nextLine());

            System.out.println("Mon hoc: " + subjects[index]);
        } catch (NumberFormatException exception) {
            System.out.println("Vui long nhap so nguyen.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Vi tri mon hoc khong ton tai.");
        }

        scanner.close();
    }
}
