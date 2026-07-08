package BasicSamplePrograms.FilesStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class sample03 {
    public static void main(String[] args) throws IOException {
        File file = new File("numbers.txt");

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("10 20 30 40");
        }

        int sum = 0;
        int count = 0;

        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextInt()) {
                sum += reader.nextInt();
                count++;
            }
        }

        System.out.println("Da doc " + count + " so tu tep " + file.getName());
        System.out.println("Tong = " + sum);
    }
}
