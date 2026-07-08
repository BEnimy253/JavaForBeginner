package BasicSamplePrograms.FilesStream;

import java.io.File;

public class sample01 {
    public static void main(String[] args) {
        File file = new File("sample-data.txt");

        System.out.println("Ten tep: " + file.getName());
        System.out.println("Duong dan tuyet doi: " + file.getAbsolutePath());
        System.out.println("Tep co ton tai khong? " + file.exists());
        System.out.println("Co phai tep tin khong? " + file.isFile());
        System.out.println("Kich thuoc byte: " + file.length());
    }
}
