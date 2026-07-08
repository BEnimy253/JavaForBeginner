package BasicSamplePrograms.Branch;

import java.util.Scanner;

public class sample03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem trung binh: ");
        double averageScore = scanner.nextDouble();

        System.out.print("Nhap diem ren luyen: ");
        int behaviorScore = scanner.nextInt();

        if (averageScore >= 8.0) {
            if (behaviorScore >= 80) {
                System.out.println("Du dieu kien nhan hoc bong.");
            } else {
                System.out.println("Hoc luc tot nhung can cai thien ren luyen.");
            }
        } else {
            System.out.println("Chua du dieu kien ve diem hoc tap.");
        }

        scanner.close();
    }
}
